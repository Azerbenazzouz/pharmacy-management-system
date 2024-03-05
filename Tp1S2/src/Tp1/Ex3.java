package Tp1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

    @Override
    public String toString() {
        return "Patient{" + "nom=" + nom + ", listeMedicaments=" + listeMedicaments + '}';
    }
    
}

class Pharmacie{
    private String nom_Pharmacie;
    private HashMap<String,Patient> patients_Clients = new HashMap<>();

    public Pharmacie(String nom_Pharmacie) {
        this.nom_Pharmacie = nom_Pharmacie;
    }
    
    public void ajoutPatient(String n , ArrayList<String> listeMedicaments){
        Patient P = new Patient(n);
        for(String m : listeMedicaments){
            P.ajoutMedicament(m);
        }
        this.patients_Clients.put(n, P);
    }
    
    public boolean ajoutMedicament(String n , String Med){
        if(this.patients_Clients.containsKey(n)){
            this.patients_Clients.get(n).ajoutMedicament(Med);
            return true;
        }
        return false;
    }
    
    public void affichePatient(String np){
        if(this.patients_Clients.containsKey(np)){
            System.out.println(this.patients_Clients.get(np).toString());
        }else{
            System.out.println("le patient n’existe pas");
        }
    }
    
    public void affiche(){
        Iterator<Map.Entry<String,Patient>> iter = this.patients_Clients.entrySet().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getValue().toString());
        }
    }
    
    public void enleverOrdonnanceVide(){
        Iterator<Map.Entry<String,Patient>> iter = this.patients_Clients.entrySet().iterator();
        while(iter.hasNext()){
            Patient P = iter.next().getValue();
            if(P.ordonnanceVide()){
                System.out.println(P.toString());
            }
        }
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Patient P1 = new Patient("Azer");
        Patient P2 = new Patient("Damino");
        


        System.out.println("Contient GripeX pour Azer : "+P1.contientMedicament("GripeX"));
        System.out.println("Contient GripeX pour Damino : "+P2.contientMedicament("GripeX"));

        Pharmacie P = new Pharmacie("Zouuu");
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("GripeX");        
        a1.add("GG");
        
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("sdsd");        
        a2.add("sdsd");

        P.ajoutPatient("Azer", a1);
        P.ajoutPatient("Damino", a2);
        
        P.ajoutMedicament("Azer", "Grqsdqsdsqd");
        P.ajoutMedicament("Damino", "qsdqsd");
        
        

        P.affichePatient("Azer");
        
    }
}
