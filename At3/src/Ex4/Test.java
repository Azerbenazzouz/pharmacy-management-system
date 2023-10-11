package Ex4;

public class Test {
    public static void main(String[] args) {

        Compétition ISET2015 = new Compétition("ISET2015", "12/11/2015");

        Etud_Coureur e1 = new Etud_Coureur("Lewis hamilton");
        e1.setDuree(120);

        Etud_Coureur e2 = new Etud_Coureur("Nico Rosberg");
        e2.setDuree(130);

        Etud_Coureur e3 = new Etud_Coureur("Sebastian Vettel");
        e3.setDuree(125);

        Etud_Coureur e4 = new Etud_Coureur("Fernando Alonso");
        e4.setDuree(140);

        ISET2015.ajouterCoureur(e1);
        ISET2015.ajouterCoureur(e2);
        ISET2015.ajouterCoureur(e3);

        ISET2015.afficher();

        System.out.println("Médaille d'or : " + ISET2015.getMedailleOr());
        System.out.println("Record battu : " + ISET2015.recordBattu());

        System.out.println("Ne participe pas : " + e4.getParticipe() + " - " + e4);
    }
}
