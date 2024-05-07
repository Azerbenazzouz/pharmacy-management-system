package entite;
enum Role {
    ADMIN, UTILISATEUR
}
public interface IDaoUtilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private String motDePasse;
    private Role role;

    public boolean authentifier(String email, String motDePasse);
    public boolean creerCompte(IDaoUtilisateur utilisateur);
    public void modifierCompte(IDaoUtilisateur utilisateur);
    public boolean supprimerCompte(String email , String motDePasse);
    public IDaoUtilisateur consulterCompte(String email);
    public boolean modifierMotDePasse(String email, String motDePasse, String nouveauMotDePasse);
    
}
