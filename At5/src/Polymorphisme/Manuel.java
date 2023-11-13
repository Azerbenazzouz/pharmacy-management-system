package Polymorphisme;

public class Manuel extends Livre{
    private int niveau;

    public Manuel(int numEnreg, String titre, String auteur, int nbrPages, int niveau) {
        super(numEnreg, titre, auteur, nbrPages);
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return super.toString() + "\nniveau=" + niveau;
    }

    public int getNiveau() {
        return this.niveau;
    }
    
}
