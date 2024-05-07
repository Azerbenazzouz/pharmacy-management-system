package dao;
enum Role {
    ADMIN, UTILISATEUR
}
public interface IDaoUtilisateur {
    
    public boolean authentifier(String email, String motDePasse);
    public boolean creerCompte(IDaoUtilisateur utilisateur);
    public void modifierCompte(IDaoUtilisateur utilisateur);
    public boolean supprimerCompte(String email , String motDePasse);
    public IDaoUtilisateur consulterCompte(String email);
    public boolean modifierMotDePasse(String email, String motDePasse, String nouveauMotDePasse);
    
}
