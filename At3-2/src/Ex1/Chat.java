package Ex1;

public class Chat {
    private int age;
    private float poids;
    private String nom;
    
    public Chat(String nom){
        this.nom = nom;
        //this.age = 0; defualt val is 0
        //this.poids = 0F; default val is 0F 
    }
    
    public Chat(float poids,int age){
        this.nom = "kettitesse";
        this.poids = poids;
        this.age = age;
    }
    
    public Chat(){
        // this.nom ="katous";
        this("katous");
    }
    
    public void SetAge(int nvAge){
        this.age = nvAge;
    }
    
    public void SetAge(){
        this.age +=1;
    }
    
    public void GetAge(){
        System.out.println("Age : "+this.age);
    }
    
    public void SetPoids(float nvPoids){
        this.poids = nvPoids;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    public void GetPoids(){
        System.out.println("Poids : "+this.poids);
    }
    
    public void ChangerNom(String nvNom){
        this.nom = nvNom;
    }
    
    public void Miaouller(){
        System.out.println(" Miaou Miaou ");
    }
    
    public void afficheChat(){
        System.out.println("Bonjour, je suis le chat "+this.nom+"\n");
        this.Miaouller();
        System.out.println("\nJ’ai "+this.age+" mois\nJe pèse "+this.poids+" Kg");
    }
    public void affiche(){
        System.out.println("Bonjour, je suis le chat " + this.nom);
        Miaouller();
        System.out.println("J’ai " + this.age + " mois");
        System.out.println("Je pèse " + this.poids+" kg");
    }

    void setPoids(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
