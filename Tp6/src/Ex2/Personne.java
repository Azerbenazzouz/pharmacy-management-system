package Ex2;

import java.util.ArrayList;
import java.util.List;

class Personne implements Homme{
    private String nom;
    private String prenom;
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    @Override
    public void identite() {
        System.out.println(this.nom + " " + this.prenom);
    }
    
}

class Client extends Personne{
    private int numéro;

    public Client(String nom, String prenom, int numéro) {
        super(nom, prenom);
        this.numéro = numéro;
    }

}

class Peuple{
    private List<Homme> pays = new ArrayList<Homme>();

    public void naissance(Homme h){
        pays.add(h);
    }
    
    public void explorer( ){
        for (Homme h : pays) {
            h.identite();
            System.out.println("\n");
        }
    }


}