package Polymorphisme;

public class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire(int numEnreg, String titre, String langue) {
        super(numEnreg, titre);
        this.langue = langue;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlangue=" + langue;
    }

    public String getLangue() {
        return this.langue;
    }
    
}
