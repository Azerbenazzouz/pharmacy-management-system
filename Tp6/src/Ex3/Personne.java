package Ex3;

public class Personne {
    private String nom;
    private int age;
    private float taille;

    public Personne(String nom, int age, float taille) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
    }

    public int getAge() {
        return this.age;
    }

    public float getTaille() {
        return this.taille;
    }
    
}

class ConditionAge implements ConditionAccès{
    private int ageMin;

    public ConditionAge(int ageMin) {
        this.ageMin = ageMin;
    }

    @Override
    public boolean autoriserAccès(Personne p) {
        return p.getAge() >= this.ageMin;
    }

    @Override
    public String getDescription() {
        return "Age minimum: " + this.ageMin;
    }

}

class ConditionTaille implements ConditionAccès{
    private float tailleMin;

    public ConditionTaille(float tailleMin) {
        this.tailleMin = tailleMin;
    }

    @Override
    public boolean autoriserAccès(Personne p) {
        return p.getTaille() >= this.tailleMin;
    }

    @Override
    public String getDescription() {
        return "Taille minimum: " + this.tailleMin;
    }

}

class Jeu {
    private String nom;
    private float prix;
    private ConditionAccès conditionJeu;
    private int nbrPers;
    private float recetteJeu;

    public Jeu(String nom, float prix, ConditionAccès conditionJeu) {
        this.nom = nom;
        this.prix = prix;
        this.conditionJeu = conditionJeu;
    }
    
    public void utilise(Personne p){
        if(this.conditionJeu.autoriserAccès(p)){
            this.nbrPers++;
            this.recetteJeu += this.prix;
        }
    }

    public float getRecette(){
        return this.recetteJeu;
    }

    public void afficheJeu(){
        System.out.println("Nom du jeu: " + this.nom+"\n"
                        + "Prix du description: " + this.conditionJeu.getDescription()+"\n"
                        + "Recette du jeu: " + this.recetteJeu+"\n");
    }

}
