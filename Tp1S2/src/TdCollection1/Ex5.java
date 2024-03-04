package TdCollection1;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

enum typeProduit {
    Extra,
    Normal
}

class Produit{
    private int codeProduit;
    private typeProduit TypeProduit;
    private float prix;

    public Produit(int codeProduit, typeProduit TypeProduit, float prix) {
        this.codeProduit = codeProduit;
        this.TypeProduit = TypeProduit;
        this.prix = prix;
    }
    
    public int getCodeProduit() {
        return codeProduit;
    }

    public typeProduit getTypeProduit() {
        return TypeProduit;
    }
     
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Produit){
            Produit p = (Produit) o;
            return this.codeProduit == p.getCodeProduit();
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.codeProduit;
    }

    @Override
    public String toString() {
        return "Produit{" + "codeProduit=" + codeProduit + ", TypeProduit=" + TypeProduit + ", prix=" + prix + '}';
    }
    
    
}

class Commande implements Comparable<Commande>{
    private int codeCommonde;
    private HashSet<Produit> lesProduit = new HashSet<>();
    public Date dateCommande;

    public Commande(int codeCommonde) {
        this.codeCommonde = codeCommonde;
    }

    public HashSet<Produit> getLesProduit() {
        return lesProduit;
    }
    
    
    public void ajouterProduit(Produit p){
        this.lesProduit.add(p);
    }
    
    public int compareTo(Commande c){
        if(this.codeCommonde == c.codeCommonde){
            return 0;
        }else if(this.codeCommonde > c.codeCommonde){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Commande{" + "codeCommonde=" + codeCommonde + ", lesProduit=" + lesProduit + ", dateCommande=" + dateCommande + '}';
    }
    
}

class StockageCommande{
    private int codeStockage;
    private String ville;
    private TreeSet<Commande> listeCommande = new TreeSet<>();

    public StockageCommande(int codeStockage, String ville) {
        this.codeStockage = codeStockage;
        this.ville = ville;
    }
    
    
    public void ajouterCommande(Commande c){
        this.listeCommande.add(c);
    }
    
    public LinkedList chercherProduit(int numCommande){
        Iterator<Commande> iter = this.listeCommande.iterator();
        Commande c = new Commande(numCommande);
        
        while(iter.hasNext()){
            Commande cmd = iter.next();
            if(cmd.compareTo(c) == 0){
                LinkedList<Produit> LP = new LinkedList<>(cmd.getLesProduit());
                return LP;
            }
        }
        return new LinkedList<>();
    }
    
    public LinkedList<Produit> chercherExtraProduit(int numCommande){
        LinkedList<Produit> LP = this.chercherProduit(numCommande);
        LinkedList<Produit> LPN= new LinkedList<>();
        Iterator<Produit> Iter = LP.iterator();
        
        while(Iter.hasNext()){
            Produit P = Iter.next();
            if(P.getTypeProduit() == typeProduit.Extra){
                LPN.add(P);
            }
        }
        return LPN;
    }

    @Override
    public String toString() {
        return "StockageCommande{" + "codeStockage=" + codeStockage + ", ville=" + ville + ", listeCommande=" + listeCommande + '}';
    }
    
}
public class Ex5 {
    public static void main(String[] args) {
        Produit P1 = new Produit(44,typeProduit.Extra,44f);
        Produit P2 = new Produit(63,typeProduit.Normal,63.5f);
        Produit P3 = new Produit(7,typeProduit.Extra,7.7f);
        
        Commande C1 = new Commande(1);
        C1.ajouterProduit(P1);        
        C1.ajouterProduit(P2);
        C1.ajouterProduit(P3);
        
        StockageCommande SC = new StockageCommande(1,"Ben Arous");
        SC.ajouterCommande(C1);
        
        System.out.println(SC.chercherExtraProduit(1));
        System.out.println("-------------------------");
        System.out.println(SC.chercherProduit(1));
    }
}
