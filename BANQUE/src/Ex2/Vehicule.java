package Ex2;

public class Vehicule {
    private String matricule;
    public String marque;
    public String modele;
    private int puissance;
    private String dateDeProduction;
    private int couleur;
    public String carburant;
    private Personne proprietaire;
    
    public void changer_Matricule(String mat , String marque , String modele , String carburant){
        this.matricule = mat;
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
    }
    
    public void changer_Date(String date){
        this.dateDeProduction = date;
    }
    
    public void changer_Puissance(int puiss){
        this.puissance = puiss;
    }
    public void changer_Couleur(int couleur){
        this.couleur = couleur;
    }
    public void afficher_Caracteristiques(){
        System.out.println("matricule : "+this.matricule+"\n marque : "+this.marque+"\n modele : "+this.modele + "\n puissance : " + this.puissance + "\n date De Production " + this.dateDeProduction + "\n couleur : "+this.couleur + "\n carburant : "+this.carburant);
        this.proprietaire.afficher_Homme();
    }
    public void changer_proprietaire(Personne P){
        this.proprietaire = P;
    }
}
