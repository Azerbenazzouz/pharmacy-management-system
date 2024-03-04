package Ex3;

public class Personne {
    private String nom;
    private String prénom;
    private String profession;
    private int age;
    
    public Personne(String nom,String Pre){
        this.nom = nom;
        this.prénom = Pre;
    }
    
    public void sePresenter(){
        System.out.println("Nom= "+this.nom+" Prénom= "+this.prénom);
    }
}
