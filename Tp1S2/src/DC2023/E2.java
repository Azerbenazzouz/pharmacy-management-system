package DC2023;

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
            s.setNoteSoutenance(sc.nextInt());
            this.lesSoutenances.put(s.getEtudiant(), s);
       }else{
           System.out.println("Soutenance n'exste pas...");
       }
    }
    
    public Soutenance avoirResultat(int matricule){
        //Iterator<Map.Entry<Etudiant,Soutenance>> iter = this.lesSoutenances.entrySet().iterator();
        //while(iter.hasNext()){
        //    Soutenance S = iter.next().getValue();
        //    if(S.getNoteSoutenance() == matricule){
        //        return S;
        //    }
        //}
        for (Map.Entry<Etudiant, Soutenance> entrySet : lesSoutenances.entrySet()) {
            Soutenance S = entrySet.getValue();
            if(S.getNoteSoutenance() == matricule){
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
        ArrayList<Soutenance> LSV = this.lesSoutenancesValidées();
        Iterator<Soutenance> iter = LSV.iterator();
        float moy = 0;
        Soutenance s = null;
        Soutenance sm = null;
        sm.setNoteSoutenance(0);
        while(iter.hasNext()){
            s = iter.next();
            if(sm.compareTo(s) == -1){
                sm=s;
            }
        }
        sm.toString();
    }
}
public class E2 {
    
}
