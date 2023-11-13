package Polymorphisme;

import javax.print.Doc;

import Polymorphisme.Roman.PrixLitteraire;

public class Test {
    public static void main(String []args){
        Bibliotheque B = new Bibliotheque(5);
        Document D1 = new Livre(1 ,"java", "Yann hackl", 605);
        Document D2 = new Dictionnaire(2 ,"English", "anglais");
        Document D3 = new Roman(3 ,"Le club des incorrigibles optimistes", "Jean-Michel Guenassia", 770 , PrixLitteraire.GONCOURT);
        Document D4 = new Revue(4 ,"Pour la science", 10, 2009);
        Document D5 = new Manuel(5, "junior tennis", "mark vale", 60, 1);

        B.ajouter(D1);
        B.ajouter(D2);
        B.ajouter(D3);
        B.ajouter(D4);
        B.ajouter(D5);

        B.afficherAuteurs();
        B.afficherDocuments();
    }
        
}
