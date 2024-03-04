package Ex2;

public class Personne {
    public String nom;
    public String prenom;
    private String adresse;
    
    public void int_Personne(String nom,String prenom,String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    
    public void changer_Adresse(String adresse){
        this.adresse = adresse;
    }
    
    public void afficher_Homme(){
        System.out.println(this.nom+" "+this.prenom+" | "+this.adresse);
    }
}
