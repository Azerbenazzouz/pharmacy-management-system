package Ex3;

public class Test {
    public static void main(String args[]){
        Personne []TabPersonne = new Personne[3];
        TabPersonne[0] = new Personne("Dupont","Jean","Etudiant",20);
        TabPersonne[1] = new Personne("Durand","Pierre","Professeur",40);
        TabPersonne[2] = new Personne("Martin","Paul","Etudiant",22);
        for(int i=0;i<TabPersonne.length;i++){
            TabPersonne[i].sePresenter();
        }
    }
}
