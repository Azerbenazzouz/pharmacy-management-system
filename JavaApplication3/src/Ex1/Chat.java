package Ex1;

public class Chat {
    private int age;
    private float poids;
    private String nom;
    public Chat(String n){
        this.nom = n;
    }
    public Chat(float p, int a){
        this("kettitesse");
        this.age = a;
        this.poids = p;
    }
    
    public Chat(){
        this("ketous");
    }

    public void setAge (int a){
        this.age = a;
    }

    public void setAge(){
        this.age += 1;
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
        System.out.println("J’ai " + this.age + " mois");
        System.out.println("Je pèse " + this.poids+" kg");
    }

}
