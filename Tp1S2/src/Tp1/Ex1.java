package Tp1;

import java.util.LinkedList;
import java.util.ListIterator;

class Produit implements Comparable<Produit>{
    private int refProduit;
    private String libelléProduit;
    private float prixProduit;

    public Produit(int refProduit, String libelléProduit, float prixProduit) {
        this.refProduit = refProduit;
        this.libelléProduit = libelléProduit;
        this.prixProduit = prixProduit;
    }

    public float getPrixProduit() {
        return prixProduit;
    }
    
    public int compareTo(Produit p){
        return Float.compare(this.prixProduit, p.getPrixProduit());
    }

    @Override
    public String toString() {
        return "Produit{" + "refProduit=" + refProduit + ", libell\u00e9Produit=" + libelléProduit + ", prixProduit=" + prixProduit + '}';
    }
    
    public void afficherProduit(){
        System.out.println(this);
    }
}


class ListeProduitTriée{
    private LinkedList<Produit> listeProduitTrée = new LinkedList<>();

    public ListeProduitTriée() {
    }

    public LinkedList<Produit> getListeProduitTrée() {
        return listeProduitTrée;
    }
    
    
    public void ajouter(Produit p){
        ListIterator<Produit> LI = this.listeProduitTrée.listIterator();
        boolean ok =false;
        while(LI.hasNext() && !ok){
            Produit np = LI.next();
            if(np.compareTo(p) == 1 ){
                LI.previous();
                LI.add(p);
                ok = true;
            }
        }
        if(!ok){
            LI.add(p);
        }
    }
    
    
}
public class Ex1 {
    public static void main(String[] args) {
        Produit P1 = new Produit(1,"1",1f);
        Produit P2 = new Produit(2,"2",2f);
        Produit P3 = new Produit(3,"3",3f);
        Produit P4 = new Produit(4,"5",4f);

        ListeProduitTriée LP = new ListeProduitTriée();
        
        LP.ajouter(P4);
        
        LP.ajouter(P2);
        LP.ajouter(P1);
        LP.ajouter(P3);
        LP.ajouter(P3);
        
        for(Produit p : LP.getListeProduitTrée()){
            p.afficherProduit();
        }
    }
}
