package Polymorphisme;

public class Document {
    private int numEnreg;
    private String titre;

    public Document(int numEnreg, String titre) {
        this.numEnreg = numEnreg;
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "numEnreg=" + numEnreg + "\ntitre=" + titre;
    }

    public int getNumEnreg() {
        return this.numEnreg;
    }

    public String getTitre() {
        return this.titre;
    }

}
