package Ex2;

public class Personne {
    protected String nom;
    protected String prenom;
    private int age;

    public Personne(String n, String p, int a){
        nom = n;
        prenom = p;
        age = a;
    }
    public Personne(String n, String p ){
        this(n, p, -1);
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public void afficher(){
        System.out.println("Je m’appelle " + nom + " " + prenom);
        if(age != -1){
            System.out.println("Mon age est " + age);
        }
    }
}
