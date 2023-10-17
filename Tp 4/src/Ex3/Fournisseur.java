package Ex3;

public class Fournisseur {
    private String nom;
    private String adresse;

    public Fournisseur(String n, String a){
        nom = n;
        adresse = a;
    }

    @Override
    public String toString(){
        return this.nom + " " + this.adresse;
    }

    public String getNom(){
        return this.nom;
    }

    public String getAdresse(){
        return this.adresse;
    }

}
