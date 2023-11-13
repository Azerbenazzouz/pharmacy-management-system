package Polymorphisme;

public class Revue extends Document{
    private int mois;
    private int annee;

    public Revue(int numEnreg, String titre, int mois, int annee) {
        super(numEnreg, titre);
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nmois=" + mois + "\nannee=" + annee;
    }

    public int getMois() {
        return this.mois;
    }

    public int getAnnee() {
        return this.annee;
    }
    
}
