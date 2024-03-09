package DC2023;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Etudiant implements Comparable<Etudiant>{
    private int matricule;
    private String nomPrenom;

    public Etudiant(int matricule, String nomPrenom) {
        this.matricule = matricule;
        this.nomPrenom = nomPrenom;
    }

    public int getMatricule() {
        return matricule;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "matricule=" + matricule + ", nomPrenom=" + nomPrenom + '}';
    }
    
    
    @Override
    public int compareTo(Etudiant e){
        return Integer.compare(this.matricule, e.matricule);
    }
}

enum TResultat{
    validé,
    nonValidé
}

class Soutenance implements Comparable<Soutenance>{
    private int codeSoutenance;
    private Date dateSoutenance;
    private TResultat resultat;
    private float noteSoutenance;
    private Etudiant étudiant;

    public void setDateSoutenance(Date dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public void setNoteSoutenance(float noteSoutenance) {
        this.noteSoutenance = noteSoutenance;
    }

    public Soutenance(int codeSoutenance, Date dateSoutenance, TResultat resultat, float noteSoutenance, Etudiant E) {
        this.codeSoutenance = codeSoutenance;
        this.dateSoutenance = dateSoutenance;
        this.resultat = resultat;
        this.noteSoutenance = noteSoutenance;
        this.étudiant = E;
    }

    public int getCodeSoutenance() {
        return codeSoutenance;
    }

    public TResultat getResultat() {
        return resultat;
    }

    public float getNoteSoutenance() {
        return noteSoutenance;
    }

    public Etudiant getEtudiant() {
        return étudiant;
    }

    @Override
    public String toString() {
        return "Soutenance{" + "codeSoutenance=" + codeSoutenance + ", dateSoutenance=" + dateSoutenance + ", resultat=" + resultat + ", noteSoutenance=" + noteSoutenance + ", E=" + étudiant + '}';
    }
    
    @Override
    public int compareTo(Soutenance s){
        return Float.compare(this.noteSoutenance, s.getNoteSoutenance());
    }
}

class Session{
    private String codeSession;
    private Date dateSession;
    private TreeMap<Etudiant,Soutenance> lesSoutenances; 
    
    public Session(String codeSession, Date dateSession) {
        this.codeSession = codeSession;
        this.dateSession = dateSession;
        this.lesSoutenances = new TreeMap<>();
    }
    
    public void ajouterSoutenance(Soutenance s ){
        this.lesSoutenances.put(s.getEtudiant(), s);
    }
    
    public void modifierResultat(Soutenance s){
       if(this.lesSoutenances.containsKey(s.getEtudiant())){
            Scanner sc = new Scanner(System.in);
            System.out.println("Donner un note : ");
            float note = sc.nextFloat();
            s.setNoteSoutenance(note);
            this.lesSoutenances.put(s.getEtudiant(), s);
       }else{
           System.out.println("Soutenance n'exste pas...");
       }
    }
    
    public Soutenance avoirResultat(int matricule){
        //Iterator<Map.Entry<Etudiant,Soutenance>> iter = this.lesSoutenances.entrySet().iterator();
        //while(iter.hasNext()){
        //    Soutenance S = iter.next().getValue();
        //    if(S.getEtudiant().getMatricule() == matricule){
        //        return S;
        //    }
        //}
        for (Map.Entry<Etudiant, Soutenance> entrySet : lesSoutenances.entrySet()) {
            Soutenance S = entrySet.getValue();
            if(S.getEtudiant().getMatricule() == matricule){
                return S;
            }
            
        }
        return null;
    }
    
    public ArrayList<Soutenance> lesSoutenancesValidées(){
        ArrayList<Soutenance> LSV = new ArrayList<>();
        
        Iterator<Map.Entry<Etudiant,Soutenance>> iter = this.lesSoutenances.entrySet().iterator();
        while(iter.hasNext()){
            Soutenance s = iter.next().getValue();
            if(s.getResultat() == TResultat.validé){
                LSV.add(s);
            }
        }
        return LSV;
    }
    
    public void afficherMeilleureSoutenanceValidée(){
        Iterator<Soutenance> iter = this.lesSoutenancesValidées().iterator();
        Soutenance s = null;
        Soutenance sm = null;
        
        while(iter.hasNext()){
            if(sm == null && s == null){
                sm = iter.next();
                s=sm;
            }
            s = iter.next();
            if(sm.compareTo(s) == -1){
                sm=s;
            }
        }
        System.out.println(sm.getNoteSoutenance());
    }
}
public class E2 {
    public static void main(String[] args) {
        Etudiant E1 = new Etudiant(7, "Azer");
        Etudiant E2 = new Etudiant(44, "Lewis");
        Etudiant E3 = new Etudiant(1, "kimi");
        
        
        Soutenance S1 = new Soutenance(1, Date.from(Instant.EPOCH), TResultat.validé, 17.6f, E1);
        Soutenance S2 = new Soutenance(2, Date.from(Instant.EPOCH), TResultat.validé, 17.44f, E2);
        Soutenance S3 = new Soutenance(3, Date.from(Instant.EPOCH), TResultat.nonValidé, 1.6f, E3);
        
        Session Ss1 = new Session("777", Date.from(Instant.EPOCH));
        
        Ss1.ajouterSoutenance(S1);
        Ss1.ajouterSoutenance(S2);
        Ss1.ajouterSoutenance(S3);
        
        Ss1.modifierResultat(S3);
        
        System.out.println("Avoir Resultat 1 : ");
        System.out.println(Ss1.avoirResultat(1).toString());
        System.out.println("-------------------------------------------");
        
        System.out.println("les Soutenances Validées : ");
        Iterator<Soutenance> s = Ss1.lesSoutenancesValidées().iterator();
        while(s.hasNext()){
            Soutenance ss = s.next();
            System.out.println(ss.toString());
        }
        System.out.println("-------------------------------------------");
        
        System.out.println("Meilleure Soutenance Validée : ");
        Ss1.afficherMeilleureSoutenanceValidée();
        System.out.println("-------------------------------------------");        
        
    }
}
