package Ex1;

public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }
    
    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override public String toString(){
        return jour + "/" + mois + "/" + annee;
    }
}
