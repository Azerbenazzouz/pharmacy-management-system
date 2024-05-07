package dao;
import entite.Utilisateur;

public interface IDaoUtilisateur {
    
    public boolean authentifier();
    public boolean creerCompte();
    public void modifierCompte();
    public boolean supprimerCompte();
    public Utilisateur consulterCompte();
    public boolean modifierMotDePasse();
    
}
