package DAO;

import Gestion.Client;

public class Test {
    public static void main(String[] args){
        LaConnexion cnx = new LaConnexion();
        
        cnx.seConnecter();
        DAOClient daoClient = new DAOClient();
        System.out.println(DAOClient.lister().toString());
        System.out.println(DAOClient.listerVille("rades"));
        System.out.println(DAOClient.chercher("1"));
        Client c = new Client("10", "Azer", "Ben Arous Nouvelle Madina", "Benazzouzazer@gmail.com");
        System.out.println("Ajout : "+DAOClient.ajouter(c));
    }
}
