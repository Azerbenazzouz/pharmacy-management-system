package TdCollection;

import java.util.LinkedList;
import java.lang.Comparable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

enum TypeProduit {

    Extra, Normal
}

class Produit {

    private int codeProduit;
    private TypeProduit typeProduit;
    private float prix;

    public Produit() {
    }

    @Override
    public String toString() {
        return "Produit{" + "codeProduit=" + codeProduit + ", typeProduit=" + typeProduit + ", prix=" + prix + '}';
    }

    public Produit(int codeProduit, TypeProduit typeProduit, float prix) {
        this.codeProduit = codeProduit;
        this.typeProduit = typeProduit;
        this.prix = prix;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public TypeProduit getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(TypeProduit typeProduit) {
        this.typeProduit = typeProduit;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Produit) {
            Produit p = (Produit) o;
            if (this.codeProduit == p.codeProduit) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.codeProduit;
    }

}

class Commande implements Comparable<Commande> {

    private int codeCommande;
    private HashSet<Produit> lesProduits = new HashSet<>();
    public Date dateCommande;

    public Commande(int codeCommande) {
        this.codeCommande = codeCommande;
//        this.dateCommande = Date.from(Instant.EPOCH);
    }

    public Commande(int codeCommande, Date dateCommande) {
        this.codeCommande = codeCommande;
        this.dateCommande = dateCommande;
    }

    public int getCodeCommande() {
        return codeCommande;
    }

    public void setCodeCommande(int codeCommande) {
        this.codeCommande = codeCommande;
    }

    public HashSet<Produit> getLesProduits() {
        return lesProduits;
    }

    public void setLesProduits(HashSet<Produit> lesProduits) {
        this.lesProduits = lesProduits;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Override
    public String toString() {
        return "Commande{" + "codeCommande=" + codeCommande + ", lesProduits=" + lesProduits + ", dateCommande=" + dateCommande + '}';
    }

    public void ajouterProduit(Produit P) {
        this.lesProduits.add(P);
    }

        public int compareTo(Commande c) {
        /*if (this.codeCommande == c.codeCommande) {
            return 0;
        } else if (this.codeCommande > c.codeCommande) {
            return 1;
        } else {
            return -1;
        }*/
        return Integer.compare(this.codeCommande, c.codeCommande);
    }
}

class StockageCommande {

    private int codeStockage;
    private String ville;
    private TreeSet<Commande> listeCommande = new TreeSet<>();

    public StockageCommande() {
    }

    public StockageCommande(int codeStockage, String ville) {
        this.codeStockage = codeStockage;
        this.ville = ville;
    }

    public int getCodeStockage() {
        return codeStockage;
    }

    public void setCodeStockage(int codeStockage) {
        this.codeStockage = codeStockage;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public TreeSet<Commande> getListeCommande() {
        return listeCommande;
    }

    @Override
    public String toString() {
        return "StockageCommande{" + "codeStockage=" + codeStockage + ", ville=" + ville + ", listeCommande=" + listeCommande + '}';
    }

    public void ajouterCommande(Commande c) {
        this.listeCommande.add(c);
    }

    public LinkedList<Produit> chercherProduit(int numC) {
        Commande cmd = new Commande(numC);
        for (Commande c : this.listeCommande) {
            if (c.getCodeCommande()==numC) {
                return new LinkedList<>(c.getLesProduits());
            }
        }
        return null;
    }
}

public class ex5 {

    public static void main(String[] args) {

    }
}
