package Prob;

public class Test {
    public static void main(String args[]){
        Film[] Tab = new Film[3];
        Tab[0] = new Film("Rissala","Mustapha Akkad",30,"Historique",3);
        Tab[1] = new Film("Titanic","James Cameron",20,"Drame",3);
        Tab[2] = new Film("Faster","George Tillman",40,"Horreur",2);
        Tab[0].setTypeSupport("Cassette");
        Tab[2].setTypeSupport("DVD");
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Entrez le titre du film");
        String titre = sc.nextLine();
        System.out.println("Entrez le réalisateur du film");
        String réalisateur = sc.nextLine();
        System.out.println("Entrez le nombre de copies à emprunter");
        int nombreCopiesDisponibles = sc.nextInt();
        
        for(Film f : Tab){
            f.afficher();
        }

        Film f = new Film(titre,réalisateur);
        for(int i=0;i<Tab.length;i++){
            if(Tab[i].comparer(f)){
                if(Tab[i].emprunter(nombreCopiesDisponibles)){
                    System.out.println("Emprunt effectué");
                }else{
                    System.out.println("Emprunt impossible");
                }
            }
        }
    }
}
