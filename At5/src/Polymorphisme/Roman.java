package Polymorphisme;

public class Roman extends Livre {
    public enum PrixLitteraire {
        GONCOURT,
        MEDICIS,
        INTERALLIE,
        AUTRE
    }
    private PrixLitteraire prixLitteraire;

    public Roman( int numEnreg, String titre, String auteur, int nbrPages, PrixLitteraire prixLitteraire) {
        super(numEnreg, titre, auteur, nbrPages);
        this.prixLitteraire = prixLitteraire;
    }

    @Override
    public String toString() {
        return super.toString() + "\nprixLitteraire=" + prixLitteraire;
    }

    public PrixLitteraire getPrixLitteraire() {
        return this.prixLitteraire;
    }
    
}
