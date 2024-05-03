package entite;

public class DaoUtilisateur implements IDaoUtilisateur{
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private String motDePasse;
    private Role role;

    public DaoUtilisateur() {
    }

    public DaoUtilisateur(int id, String nom, String prenom, String email, String telephone, String adresse, String motDePasse, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public DaoUtilisateur(String nom, String prenom, String email, String telephone, String adresse, String motDePasse, Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public DaoUtilisateur(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    @Override
    public boolean authentifier(String email, String motDePasse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authentifier'");
    }

    @Override
    public boolean creerCompte(IDaoUtilisateur utilisateur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creerCompte'");
    }

    @Override
    public void modifierCompte(IDaoUtilisateur utilisateur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierCompte'");
    }

    @Override
    public boolean supprimerCompte(String email, String motDePasse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'supprimerCompte'");
    }

    @Override
    public IDaoUtilisateur consulterCompte(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consulterCompte'");
    }

    @Override
    public boolean modifierMotDePasse(String email, String motDePasse, String nouveauMotDePasse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierMotDePasse'");
    }

}
