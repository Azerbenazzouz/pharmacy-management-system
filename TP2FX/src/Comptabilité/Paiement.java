package Comptabilité;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
enum type {
    espèce,
    chèque,
    traite
}
public class Paiement {
    private Date date;
    private TreeSet<Facture> LesFactures = new TreeSet<>();

    public Paiement(Date date) {
        this.date = date;
    }
    
    public Facture chercher(int num){
        Iterator<Facture> iter = this.LesFactures.iterator();
        while (iter.hasNext()) {            
            Facture F = iter.next();
            if(F.getNum() == num){
                return F;
            }
        }
        return null;
    }
    public void ajouterFacture(Facture fac){
        this.LesFactures.add(fac);
    }

}
