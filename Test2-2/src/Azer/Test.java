package Azer;

import java.util.Calendar;

public class Test {
    public static void main(String []args){
        Chambre c1 = new Chambre(0, Chambre.TypeChambre.SINGLE, 44);
        Chambre c2 = new Chambre(1, Chambre.TypeChambre.TRIPLE, 55);

        Calendar d = Calendar.getInstance();
        d.set(2023, 11, 29);

        Reservation r = new Reservation(d, 0);

        r.ajouter(c1);
        r.ajouter(c2);

        System.out.println(r);

    }
}

