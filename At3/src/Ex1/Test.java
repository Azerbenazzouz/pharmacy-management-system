package Ex1;

public class Test {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(44, "Hamilton", "Lewis", "F1");
        Etudiant e2 = new Etudiant(33, "Verstappen", "Max", "F1");

        Stage s1 = new Stage(e1, "Mercedes", 20, 20);
        Stage s2 = new Stage(e2, "Red Bull", 3, 4);
        s1.setDateSoutenance(new Date(1, 1, 2021));
        s2.setDateSoutenance(new Date(1, 2, 2021));
        s1.affiche();
        s2.affiche();
        

    }
}
