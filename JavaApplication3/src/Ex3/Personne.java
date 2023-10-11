package Ex3;

public class Personne {
    private String nom;
    private String prenom;
    private String profession;
    private int age;

    public Personne( String nom,String prenom ){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void sePresenter(){
        System.out.println("Nom :"+nom+" Prenom :"+nom);
    }
}
