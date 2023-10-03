package Ex3;

public class Personne {
    private String nom;
    private String prenom;
    private String profession;
    private int age;
    public Personne(String nom,String prenom,String profession,int age){
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
        this.age = age;
    }
    public void sePresenter(){
        System.out.println("Nom :"+nom+" Prenom :"+nom);
    }
}
