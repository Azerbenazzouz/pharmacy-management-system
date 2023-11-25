package test;

import java.util.ArrayList;
import java.util.List;

public abstract class Voiture {
    enum etatVoiture {
        DISPONIBLE,
        INDISPONIBLE,
    }
    private int idVoiture;
    private String marque;
    private float prixLocation;
    private etatVoiture etat;

    public Voiture(int idVoiture ,String marque , float prixLocation) {
        this.idVoiture = idVoiture;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    // getMarque
    public String getMarque() {
        return this.marque;
    }

    // getEtat
    public etatVoiture getEtat() {
        return this.etat;
    }
    // setEtat
    public void setEtat(etatVoiture etat) {
        this.etat = etat;
    }
    // getPrixLocation
    public float getPrixLocation() {
        return this.prixLocation;
    }
    // calculerPrixAPayer
    public abstract float calculerPrixAPayer();
    @Override
    public String toString() {
        return "Id voiture : " + this.idVoiture 
                + "\nMarque : " + this.marque 
                + "\nPrix de location : " + this.prixLocation 
                + "\nEtat : " + this.etat;
    }
}

class VoitureDeLuxe extends Voiture {
    private float montSupp;

    public VoitureDeLuxe( int idVoiture , String marque , float prixLocation , float montSupp) {
        super(idVoiture , marque , prixLocation);
        this.montSupp = montSupp;
    }

    public float calculerPrixAPayer(){
        return super.getPrixLocation() + this.montSupp;
    }

    public void afficher(){
        System.out.println(super.toString() +"\nMontent supplémentaire : " + this.montSupp);
    }
}

class VoitureSport extends Voiture {
    private float montRéduction;
    private String vitesseMaximale;

    public VoitureSport( int idVoiture , String marque , float prixLocation , float montRéduction , String vitesseMaximale) {
        super(idVoiture , marque , prixLocation);
        this.montRéduction = montRéduction;
        this.vitesseMaximale = vitesseMaximale;
    }

    public float calculerPrixAPayer(){
        return super.getPrixLocation() - this.montRéduction;
    }

    public void afficher(){
        System.out.println(super.toString() +"\nMontent de réduction : " + this.montRéduction + "\nVitesse maximale : " + this.vitesseMaximale);
    }

}

class AgenceLocation {
    private String nomAgence;
    private List<Voiture> tabVoiture= new ArrayList<Voiture>();

    public AgenceLocation(String nomAgence ) {
        this.nomAgence = nomAgence;
    }

    public void ajouterVoiture(Voiture v){
        tabVoiture.add(v);
    }

    public Voiture louerVoiture(float f ) {
        for (Voiture v : tabVoiture) {
            if(v.getEtat() == Voiture.etatVoiture.DISPONIBLE && v.calculerPrixAPayer() <= f){
                v.setEtat(Voiture.etatVoiture.INDISPONIBLE);
                return v;
            }
        }
        return null;
    }

    public void rendreVoiture(Voiture v){
        for (Voiture voiture : tabVoiture) {
            if(voiture == v){
                voiture.setEtat(Voiture.etatVoiture.DISPONIBLE);
            }
        }
    }

    public String marqueDeSportLaPlusChère() {
        for (Voiture v : tabVoiture) {
            if(v instanceof VoitureSport){
                return v.getMarque();
            }
        }
        return null;
    }

    public List<Voiture> lesVoituresDisponibles(){
        List<Voiture> tab = new ArrayList<Voiture>();
        for(Voiture v : tabVoiture){
            if(v.getEtat() == Voiture.etatVoiture.DISPONIBLE){
                tab.add(v);
            }
        }
        return tab;
    }

    public String getNomAgence() {
        return this.nomAgence;
    }
    
}