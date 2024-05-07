package dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DB;



public class DaoUtilisateur implements IDaoUtilisateur{
    private Connection cn = DB.connection();

    public static enum Role{
        PHARMACIEN,
        ADMINISTRATEUR,
    }

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private String motDePasse;
    private Role role;
    private boolean authentifie;

    public DaoUtilisateur() {
        this.authentifie = false;
    }

    public DaoUtilisateur(int id, String nom, String prenom, String email, String telephone, String adresse, String motDePasse, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.motDePasse = this.hashMotDePasse(motDePasse);
        this.role = role;
        this.authentifie = false;
    }

    public DaoUtilisateur(String nom, String prenom, String email, String telephone, String adresse, String motDePasse, Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.motDePasse = this.hashMotDePasse(motDePasse);
        this.role = role;
        this.authentifie = false;
    }

    public DaoUtilisateur(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = this.hashMotDePasse(motDePasse);
        this.authentifie = false;
    }
    
    @Override
    public boolean creerCompte() {
        if(this.utilisateurInfoIsNotEmpty()) return false;

        try{
            PreparedStatement ps = cn.prepareStatement("SELECT COUNT(*) FROM `utilisateur` WHERE `email` = ?");
            ps.setString(1, this.email);
            ps.executeQuery();
            
            ResultSet rs = ps.getResultSet();
            rs.next();
            if(rs.getInt(1) != 0) return false;

            ps = cn.prepareStatement("INSERT INTO `utilisateur`(`nom`, `prenom`, `email`, `telephone`, `adresse`, `mdp`, `role`) VALUES (?,?,?,?,?,?,?);");
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, email);
            ps.setString(4, telephone);
            ps.setString(5, adresse);
            ps.setString(6, this.hashMotDePasse(motDePasse));
            ps.setString(7, role.toString());
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean authentifier() {
        if(this.email.isEmpty() || this.motDePasse.isEmpty()) return false;
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM `utilisateur` WHERE `email` = ? AND `mdp` = ?");
            ps.setString(1, this.email);
            ps.setString(2, this.motDePasse);
            ps.executeQuery();
            
            ResultSet rs = ps.getResultSet();
            rs.next();
            if(rs.getRow() != 0){
                this.id = rs.getInt("id");
                this.nom = rs.getString("nom");
                this.prenom = rs.getString("prenom");
                this.telephone = rs.getString("telephone");
                this.adresse = rs.getString("adresse");
                this.role = Role.valueOf(rs.getString("role"));
                System.out.println("Authentification réussie");
                this.authentifie = true;
                return true;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void modifierCompte(DaoUtilisateur utilisateur) {
        if(this.authentifie == false) return;
        try{
            PreparedStatement ps = cn.prepareStatement("UPDATE `utilisateur` SET `nom` = ?, `prenom` = ?, `email` = ?, `telephone` = ?, `adresse` = ?, `mdp` = ?, `role` = ? WHERE `id` = ?");
            ps.setString(1, utilisateur.nom);
            ps.setString(2, utilisateur.prenom);
            ps.setString(3, utilisateur.email);
            ps.setString(4, utilisateur.telephone);
            ps.setString(5, utilisateur.adresse);
            ps.setString(6, utilisateur.hashMotDePasse(utilisateur.motDePasse));
            ps.setString(7, utilisateur.role.toString());
            ps.setInt(8, utilisateur.id);
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean supprimerCompte() {
        if(this.authentifie == false) return false;
        try{
            PreparedStatement ps = cn.prepareStatement("DELETE FROM `utilisateur` WHERE `id` = ?");
            ps.setInt(1, this.id);
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public DaoUtilisateur consulterCompte() {
        if(this.authentifie == false) return null;
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM `utilisateur` WHERE `id` = ?");
            ps.setInt(1, this.id);
            ps.executeQuery();
            
            ResultSet rs = ps.getResultSet();
            rs.next();
            DaoUtilisateur utilisateur = new DaoUtilisateur();
            utilisateur.id = rs.getInt("id");
            utilisateur.nom = rs.getString("nom");
            utilisateur.prenom = rs.getString("prenom");
            utilisateur.email = rs.getString("email");
            utilisateur.telephone = rs.getString("telephone");
            utilisateur.adresse = rs.getString("adresse");
            utilisateur.role = Role.valueOf(rs.getString("role"));
            return utilisateur;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    @Override
    public boolean modifierMotDePasse(String nouveauMotDePasse) {
        if(this.authentifie == false) return false;
        try{
            PreparedStatement ps = cn.prepareStatement("UPDATE `utilisateur` SET `mdp` = ? WHERE `id` = ?");
            ps.setString(1, this.hashMotDePasse(nouveauMotDePasse));
            ps.setInt(2, this.id);
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean utilisateurInfoIsNotEmpty(){
        return this.nom.isEmpty() || this.prenom.isEmpty() || this.email.isEmpty() || this.telephone.isEmpty() || this.adresse.isEmpty() || this.motDePasse.isEmpty();
    }
    
    public String hashMotDePasse(String motDePasse){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(motDePasse.getBytes());
            byte[] digest = md.digest();

            StringBuilder sb = new StringBuilder();

            for(byte b : digest){
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isAuthentifie() {
        return authentifie;
    }

    public void setAuthentifie(boolean authentifie) {
        this.authentifie = authentifie;
    }

    @Override
    public String toString() {
        return "DaoUtilisateur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", telephone=" + telephone + ", adresse=" + adresse + ", motDePasse=" + motDePasse + ", role=" + role + '}';
    }

    
}
