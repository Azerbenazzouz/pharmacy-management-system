package dev;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ResultatLancement r1 = new ResultatLancement(10.5f , "5/5/2016");
        ResultatLancement r2 = new ResultatLancement(18.1f , "6/5/2016");
        Lanceur l1 = new Lanceur("1" , "Tunis" , r1);
        Lanceur l2 = new Lanceur("9" , "Sousse" , r2);
        l1.setNom("Toumi");
        l2.setNom("Benmoustfa");
        List<Lanceur> tabLanceur = new ArrayList<Lanceur>();
        tabLanceur.add(l1);
        tabLanceur.add(l2);
        Epreuve e = new Epreuve("EpreuveLance" , tabLanceur);
        e.afficherEpreuve();
        System.out.println("Les lanceurs battants le record: ");
        for(Lanceur l : e.LesLanceursBattantsRecord()){
            System.out.println(l.toString());
        }
        ResultatLancement r3 = new ResultatLancement(16.7f , "5/5/2016");
        Lanceur l3 = new Lanceur("15" , "Bizerte" , r3);
        l3.setNom("Tlili");
        e.changerResultat(l3);
        System.out.println("Après le changement du résultat: ");
        e.afficherEpreuve();
        
    }
}
