package dev;

import java.util.ArrayList;
import java.util.List;

public class Epreuve {
    private String nomEpreuve;
    private final float RECORD_A_BATTRE = 17.12f;
    private List<Lanceur> tabLanceur = new ArrayList<Lanceur>();

    public Epreuve(String nomEpreuve , List<Lanceur> tabLanceur){
        this.nomEpreuve = nomEpreuve;
        this.tabLanceur = tabLanceur;
    }

    public List<Lanceur> LesLanceursBattantsRecord(){
        List<Lanceur> tabLanceurBattantRecord = new ArrayList<Lanceur>();
        for(Lanceur l : this.tabLanceur){
            if(l.getRésultat().getDistance() > this.RECORD_A_BATTRE){
                tabLanceurBattantRecord.add(l);
            }
        }
        return null;
    }

    public boolean changerResultat(Lanceur l){
        boolean resultatChanger = false;
        for(Lanceur lanceur : this.tabLanceur){
            if(lanceur.equals(l)){
                lanceur.setRésultat(l.getRésultat());
                resultatChanger = true;
            }
        }
        return resultatChanger;
    }

    public void afficherEpreuve(){
        System.out.println("Nom de l'épreuve: " + this.nomEpreuve);
        for(Lanceur l : this.tabLanceur){
            System.out.println(l.toString());
        }
    }
}
