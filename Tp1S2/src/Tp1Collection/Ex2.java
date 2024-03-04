package Tp1Collection;

import com.sun.prism.image.Coords;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Coordonnees{
    private int Tel;
    private String Adr;

    public Coordonnees(int Tel, String Adr) {
        this.Tel = Tel;
        this.Adr = Adr;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getAdr() {
        return Adr;
    }

    public void setAdr(String Adr) {
        this.Adr = Adr;
    }
    
}

class Annuaire{
    private HashMap<String,Coordonnees> a = new HashMap();
    
    public void Ajout(String N,Coordonnees C){
        this.a.put(N, C);
    }
    
    public void AffichCoord(String N){
        Coordonnees C = this.a.get(N);
        if(this.a.containsKey(N)){
            System.out.println("Tel : "+C.getTel()+" Adr : "+C.getAdr());
        }else{
            System.out.println("Accun Coord");
        }
    }
    
    public void ModifCoord(String N){
        Coordonnees C = this.a.get(N);
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        if(C==null){
            System.out.println("Accun Coord");
        }else{
            Coordonnees NC = this.a.get(N);
            System.out.println("Coord : ");
            this.AffichCoord(N);
            System.out.println("Donner nouveux Tel : ");
            NC.setTel(sc.nextInt());
            System.out.println("Donner nouveux Adr : ");
            NC.setAdr(scn.next());
            this.a.replace(N, C, NC);
        }
    }
    
    public void Suppression(String N){
        this.a.remove(N);
    }
    
    public void ListerNoms(){
        Iterator<String> iter = this.a.keySet().iterator();
        
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public void ListerTel(){
        Iterator<Map.Entry<String,Coordonnees>> iter = this.a.entrySet().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getValue().getTel());
        }
    }
    
    public void ListerAdr(){
        Iterator<Map.Entry<String,Coordonnees>> iter = this.a.entrySet().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getValue().getAdr());
        }
    }
    public void AffichAnnuaire(){
        this.ListerNoms();
        this.ListerTel();
        this.ListerAdr();
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Coordonnees C1 = new Coordonnees(1,"c1");
        Coordonnees C2 = new Coordonnees(2,"c2");
        Coordonnees C3 = new Coordonnees(3,"c3");
        
        Annuaire a = new Annuaire();
        
        a.Ajout("C1", C1);
        a.Ajout("C2", C2);
        a.Ajout("C3", C3);

        a.AffichAnnuaire();
    }
}
