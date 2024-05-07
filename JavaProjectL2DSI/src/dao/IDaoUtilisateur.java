package dao;

public interface IDaoUtilisateur {
    public boolean authentifier();
    public boolean creerCompte();
    public void modifierCompte(DaoUtilisateur utilisateur);
    public boolean supprimerCompte();
    public DaoUtilisateur consulterCompte();
    public boolean modifierMotDePasse(String nouveauMotDePasse);
}
