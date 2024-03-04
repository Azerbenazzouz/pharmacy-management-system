package Ex2;

public class Véhicule {
    private String matricule;
    public String marque;
    public String modèle;
    private int puissance;
    private String dateDeProduction;
    private int couleur;
    public String carburant;
    private Personne p;
    
    public void changer_Matricule(String mat){
        this.matricule = mat;
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
        System.out.println(this.carburant+"|"+this.dateDeProduction+"|"+this.marque+"|"+this.matricule+"|"+this.modèle);
    }
    
    public void affecter_proprietaire(Personne p){
        this.p = p;
    }
}
