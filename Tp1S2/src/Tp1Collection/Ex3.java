package Tp1Collection;

import java.util.HashSet;
import java.util.Set;

class Medicament{
    private int ref;
    private String lebellé;

    public Medicament(int ref, String lebellé) {
        this.ref = ref;
        this.lebellé = lebellé;
    }

    public Medicament() {
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getLebellé() {
        return lebellé;
    }

    public void setLebellé(String lebellé) {
        this.lebellé = lebellé;
    }

    @Override
    public String toString() {
        return "Medicament{" + "ref=" + ref + ", lebell\u00e9=" + lebellé + '}';
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Medicament){
            Medicament m = (Medicament) o;
            if(this.ref == m.ref && this.lebellé.equals(m.lebellé)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.ref;
    }
}

class Patient{
    private String nom;
    private HashSet<Medicament> listeMedicaments = new HashSet<Medicament>();

    public Patient(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
    public boolean ordonnanceVide(){
        return listeMedicaments.isEmpty();
    }
    
    public void ajoutMedicament(Medicament m){
        listeMedicaments.add(m);
    }
    
    public boolean contientMedicament(Medicament m){
        /*for(Medicament med : listeMedicaments){
            if(med.equals(m)){
                return true;
            }
        }
        return false;
        */
        return listeMedicaments.contains(m);
    }
    
    public void afficheOrdonnance(){
        for(Medicament m : listeMedicaments){
            System.out.println(m);
        }
    }
    
    public void affichePatient(){
        System.out.println("Nom : "+this.nom);
        this.afficheOrdonnance();
    }
    
    
}

public class Ex3 {
    public static void main(String[] args) {
        Medicament m1 = new Medicament(44,"Lewis");
        Medicament m2 = new Medicament(7,"vetel");
        Medicament m3 = new Medicament(6,"toto");

        Patient p = new Patient("Azer");
        
        p.ajoutMedicament(m1);
        p.ajoutMedicament(m2);
        System.out.println(p.contientMedicament(m3));
        p.ajoutMedicament(m3);

        p.afficheOrdonnance();
        p.affichePatient();
    }
}
