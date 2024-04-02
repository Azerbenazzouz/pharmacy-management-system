package GestionStage;

import java.util.*;

class Stage{
    private int numStage;
    private String spécialité;
    private float noteStage;

    public Stage(int numStage, String spécialité, float noteStage) {
        this.numStage = numStage;
        this.spécialité = spécialité;
        this.noteStage = noteStage;
    }

    public int getNumStage() {
        return numStage;
    }

    public void setNumStage(int numStage) {
        this.numStage = numStage;
    }

    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }

    public float getNoteStage() {
        return noteStage;
    }

    public void setNoteStage(float noteStage) {
        this.noteStage = noteStage;
    }

    
    
    @Override
    public String toString() {
        return "Stage{" + "numStage=" + numStage + ", sp\u00e9cialit\u00e9=" + spécialité + ", noteStage=" + noteStage + '}';
    }

    @Override
    public int hashCode() {
        Float i = new Float(this.noteStage);
        return i.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Stage){
            Stage s = (Stage) obj;
            if(s.getNumStage() == this.numStage){
                return true;
            }
        }
        return false;
    }
    
}
class ServiceStage{
    private String nomService;
    private HashSet<Stage> lesStages;

    public ServiceStage( String n) {
        this.nomService = n;
        this.lesStages = new HashSet<>();
    }
    
    public float chercherNote(int numStage){
        Iterator<Stage> iter = this.lesStages.iterator();
        
        while(iter.hasNext()){
            Stage s = iter.next();
            if(s.getNumStage() == numStage) return s.getNoteStage();
        }
        return 0F;
    }
    
    public boolean modifierStage(Stage s){
        if(this.lesStages.contains(s)){
            this.lesStages.add(s);
            return true;
        }
        return false;
    }
    
    public void ajouterStage(Stage s){
        if(!this.lesStages.contains(s)){
            this.lesStages.add(s);
        }
    }
    
    public void listerStages(){
        for(Stage s : this.lesStages){
            System.out.println(s);
        }
    }
    
    
}
public class Test {
    public static void main(String args[]){
        ServiceStage SI = new ServiceStage("SI");
        Stage S1 = new Stage(15,"DSI",16.5F);
        Stage S2 = new Stage(19,"SysEmb",18.87F);
        Stage S3 = new Stage(19,"RSI",18.87F);

        SI.ajouterStage(S1);
        SI.ajouterStage(S2);
        
        System.out.println("Chercher note stage 15 : "+SI.chercherNote(15));
        SI.listerStages();
        
        System.out.println(SI.modifierStage(S3));
        SI.listerStages();
    }
}
