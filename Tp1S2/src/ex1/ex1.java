/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.*;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;

/**
 *
 * @author Lenovo
 */



class Produit implements Comparable<Produit>{

    @Override
    public String toString() {
        return "Produit{" + "refProduit=" + refProduit + ", libelleProduit=" + libelleProduit + ", prixProduit=" + prixProduit + '}';
    }

    private int refProduit;

    public int getRefProduit() {
        return refProduit;
    }

    public void setRefProduit(int refProduit) {
        this.refProduit = refProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public float getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(float prixProduit) {
        this.prixProduit = prixProduit;
    }
    private String libelleProduit;
    private float prixProduit;
    
    public Produit(int refProduit, String libelleProduit, float prixProduit) {
        this.refProduit = refProduit;
        this.libelleProduit = libelleProduit;
        this.prixProduit = prixProduit;
    }

    
    
    @Override
    public int compareTo(Produit e) {
        if(this.prixProduit>e.prixProduit){
            return 1;
        }
        if(this.prixProduit<e.prixProduit){
            return -1;
        }
        return 0;
        
            
    }
    
    public void afficherProduit(){
        System.out.println(this.toString());
    }
}

class ListeProduitTriee {
    private LinkedList<Produit> listeProduitTriee ;
    
    public ListeProduitTriee(){ 
        this.listeProduitTriee = new LinkedList<Produit>();
    }
    
    public void ajouter(Produit p){
        ListIterator<Produit> It = listeProduitTriee.listIterator();
        Boolean trouve = false;
        while(It.hasNext() && !trouve){
            if(p.compareTo(It.next())==-1){
                It.add(p);
                trouve = true;
            }
        }
        if(!trouve){
            It.add(p);
        }
    }
    
    public void afficher(){
        ListIterator<Produit> It = listeProduitTriee.listIterator();
        while(It.hasNext()){
            Produit p = It.next();
            p.afficherProduit();
        }
    }
}

public class ex1 {
    public static void main(String Args[]){
        ListeProduitTriee LP = new ListeProduitTriee();
        Produit p1 = new Produit(1,"1",0.1f);
        Produit p2 = new Produit(2,"2",0.5f);
        Produit p3 = new Produit(3,"3",0.2f);

        LP.ajouter(p1);
        LP.ajouter(p2);
        LP.ajouter(p3);
        LP.afficher();
    }
}
