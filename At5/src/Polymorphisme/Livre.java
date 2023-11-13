package Polymorphisme;

public class Livre extends Document{
    private String auteur;
    private int nbrPages;

    public Livre(int numEnreg, String titre, String auteur, int nbrPages) {
        super(numEnreg, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString() {
        return super.toString() + "\nauteur=" + auteur + "\nnbrPages=" + nbrPages;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public int getNbrPages() {
        return this.nbrPages;
    }
    
}
