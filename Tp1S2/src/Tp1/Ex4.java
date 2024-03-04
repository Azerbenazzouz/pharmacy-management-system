package Tp1;

import java.util.Iterator;
import java.util.Set;

class Patient{
    private String nom;
    private Set<String> listeMedicaments;

    public Patient(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
    public boolean ordonnanceVide(){
        return this.listeMedicaments.isEmpty();
    }
    
    public void ajoutMedicament(String M){
        this.listeMedicaments.add(M);
    }
    
    public boolean contientMedicament(String M){
        return this.listeMedicaments.contains(M);
    }
    
    public void afficheOrdonnance(){
        Iterator<String> iter = this.listeMedicaments.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public void affichePatient(){
        System.out.println(this.nom);
        this.afficheOrdonnance();
    }
}

public class Ex4 {
    public static void main(String[] args) {
        
    }
}
