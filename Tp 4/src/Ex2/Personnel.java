package Ex2;

public class Personnel extends Personne{
    private float salaire;
    public Personnel(String n, String p , int a , float s){
        super(n , p , a);
        salaire = s;
    }
    public Personnel(String n, String p , int a){
        super(n , p , a);
        salaire = 1000;
    }

    public float getSalaire() {
        return salaire;
    }

    public void augmenter(float p){
        salaire += salaire * p / 100;
    }
    
    public void augmenter(){
        augmenter(5);
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Je suis un membre du personnel");
        System.out.println("Mon salaire est " + salaire + " dinars");
    } 
}
