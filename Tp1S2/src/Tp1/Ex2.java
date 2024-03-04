package Tp1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Coordonnees{
    private int Tel;
    private String Adr;

    public Coordonnees() {
    }

    public Coordonnees(int Tel, String Adr) {
        this.Tel = Tel;
        this.Adr = Adr;
    }

    public int getTel() {
        return Tel;
    }

    public String getAdr() {
        return Adr;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public void setAdr(String Adr) {
        this.Adr = Adr;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Coordonnees){
            Coordonnees c = (Coordonnees) o;
            return this.Tel == c.getTel() && this.Adr.equals(c.getAdr());
        }
        return false;
    }

    
    
    @Override
    public int hashCode(){
        return this.Tel;
    }

    @Override
    public String toString() {
        return "Coordonnees{" + "Tel=" + Tel + ", Adr=" + Adr + '}';
    }
    
}

class Annuaire{
    HashMap<String,Coordonnees> LA = new HashMap<>();
    
    public void ajout(String N , Coordonnees C){
        LA.put(N, C);
    }
    
    public void AffichCoord(String N){
        if(this.LA.containsKey(N)){
            System.out.println(this.LA.get(N).toString());
        }else{
            System.out.println("Pas De coord");
        }
    }

    public void ModifCoord(String N){
        if(this.LA.containsKey(N)){
            Scanner S = new Scanner(System.in);
            Scanner Sc = new Scanner(System.in);
            System.out.println("Les Information : ");
            System.out.println(this.LA.get(N).toString());
            System.out.println("Donner Tel : ");
            int tel = S.nextInt();
            System.out.println("Donner Adr : ");
            String adr = S.next();
            Coordonnees c = new Coordonnees(tel,adr);
            this.LA.replace(N, c);
        }
    }
    
    public void Suppression(String N){
        this.LA.remove(N);
    }
    
    public void ListerNoms(){
        Iterator<String> Iter = this.LA.keySet().iterator();
        while(Iter.hasNext()){
            System.out.println(Iter.next());
        }
    }
    
    public void ListerTel(){
        Iterator<Map.Entry<String,Coordonnees>> Iter = this.LA.entrySet().iterator();
        while(Iter.hasNext()){
            System.out.println(Iter.next().getValue().getTel());
        }
    }
    
    public void ListerAdr(){
        Iterator<Map.Entry<String,Coordonnees>> Iter = this.LA.entrySet().iterator();
        while(Iter.hasNext()){
            System.out.println(Iter.next().getValue().getAdr());
        }
    }
    
    
    public void AffichAnnuaire(){
        Iterator<Map.Entry<String,Coordonnees>> Iter = this.LA.entrySet().iterator();

        while(Iter.hasNext()){
            Map.Entry<String,Coordonnees> c = Iter.next();
            System.out.println(c.getKey());
            System.out.println(c.getValue().toString());
        }
    }
}


public class Ex2 {
    public static void main(String[] args) {
        Coordonnees C1 = new Coordonnees(44, "Lewis");
        Coordonnees C2 = new Coordonnees(7, "Vetel");
        Coordonnees C3 = new Coordonnees(63, "Russel");
        
        Annuaire a = new Annuaire();
        
        a.ajout("Hamertime",C1);
        a.ajout("YouAreWorldChamp", C2);
        a.ajout("CloseTheGap", C3);
        
        a.AffichAnnuaire();
        System.out.println("--------------------------");
        a.ModifCoord("Hamertime");
        a.AffichAnnuaire();
        System.out.println("--------------------------");
        a.Suppression("CloseTheGap");
        a.AffichAnnuaire();
    }
}
