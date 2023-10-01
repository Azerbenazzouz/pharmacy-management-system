package Ex2;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse; 

    public void init_Personne(String nom ,String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public void changer_Adresse(String adresse){
        this.adresse = adresse;
    }
    public void afficher_Homme(){
        System.out.println("Nom : "+this.nom + "\n"+
                           "Prenom : " + this.prenom + "\n"+
                           "Adresse : "+ this.adresse);

    }
}
