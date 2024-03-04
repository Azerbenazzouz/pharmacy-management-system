package dev;

public class ResultatLancement implements IResultat{
    private float distance;
    private String dateRésultat;

    public ResultatLancement(float distance, String dateRésultat) {
        this.distance = distance;
        this.dateRésultat = dateRésultat;
    }

    public float getDistance() {
        return this.distance;
    }

    public String getInformation() {
        return "Distance: " + this.distance + "m, Date: " + this.dateRésultat;
    }

    public boolean résultatMeilleur(IResultat r) {
        return this.distance > ((ResultatLancement) r).getDistance();
    }

    
}
