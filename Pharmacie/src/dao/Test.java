package dao;
import entite.Utilisateur;
public class Test {
    public static void main(String[] args) {
        Utilisateur utilisateur = new Utilisateur("John Doe", "admin@gmail.com", "admin", 123456789, "ROLE_ADMIN");
        DaoUtilisateur daoUtilisateur = new DaoUtilisateur();
        daoUtilisateur.setUtilisateur(utilisateur);

        if(daoUtilisateur.authentifier()){
            System.out.println("Authentification reussie");
        }else{
            System.out.println("Authentification echouee");
        }
        System.out.println("Hello, World!");
    }    
}
