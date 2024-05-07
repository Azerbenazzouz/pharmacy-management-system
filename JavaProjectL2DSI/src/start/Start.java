package start;

import dao.DaoUtilisateur;
import utils.DB;

public class Start {

    public static void main(String[] args) {
        DB.connection();
        
        DaoUtilisateur utilisateur = new DaoUtilisateur(
            "nom", 
            "prenom", 
            "zzzouuz", 
            "telephone", 
            "adresse", 
            "motDePasse", 
            DaoUtilisateur.Role.ADMINISTRATEUR
        );
        System.out.println(utilisateur.creerCompte());

        DaoUtilisateur utilisateur2 = new DaoUtilisateur(
            "zzzouuz",
            "motDePasse"
        );
        System.out.println(utilisateur2.authentifier());
        System.out.println(utilisateur2.toString());
        System.out.println(utilisateur2.modifierMotDePasse("LH44"));
        utilisateur2.setNom("azer");
        utilisateur2.modifierCompte(utilisateur2);
        System.out.println(utilisateur2.toString());
        // System.out.println(utilisateur2.supprimerCompte());

    }
    
}
