package Ex1;

public class Chat {
    private int age;
    private float poids;
    private String nom;
    
    public void setAge (int a){
        this.age = a;
    }

    public int getAge (){
        return this.age;
    }
    
    public void setPoids (float p){
        this.poids = p;
    }

    public float getPoids (){
        return this.poids;
    }

    public void setNom (String n){
        this.nom = n;
    }

    public String getNom (){
        return this.nom;
    }

    public void Miaouller(){
        System.out.println(" Miaou Miaou");
    }

    public void affiche(){
        System.out.println("Bonjour, je suis le chat " + this.nom);
        Miaouller();
        System.out.println("J’ai " + this.age);
        System.out.println("Je pèse " + this.poids);
    }

}
