package Ex3;

public class Test {
    public static void main(String args[]){
        Personne []TabPersonne = new Personne[3];
        TabPersonne[0] = new Personne("Dupont","Jean");
        TabPersonne[1] = new Personne("Durand","Pierre");
        TabPersonne[2] = new Personne("Martin","Paul");

        for(int i=0;i<TabPersonne.length;i++){
            // TabPersonne[i].sePresenter();
            System.out.println("Nom :"+TabPersonne[i].getNom()+" Prenom :"+TabPersonne[i].getPrenom());
        }
    }
}
