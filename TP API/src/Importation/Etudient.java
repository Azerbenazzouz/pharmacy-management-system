package Importation;

public class Etudient implements Comparable<Etudient>{
    private String nom;
    private String Prenom;

    public Etudient(String nom, String Prenom) {
        this.nom = nom;
        this.Prenom = Prenom;
    }

    @Override
    public String toString() {
        return "Etudient{" + "nom=" + nom + ", Prenom=" + Prenom + '}';
    }
        

    @Override
    public int compareTo(Etudient e) {
        return nom.compareTo(e.getNom());
    }

    public String getNom() {
        return nom;
    }    
    
}
