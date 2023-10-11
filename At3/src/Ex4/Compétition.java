package Ex4;

public class Compétition {
    private String désignationComp;
    private String dateComp;
    private final int RECORD_A_BATTRE = 132;
    private Etud_Coureur[] tabEtud = new Etud_Coureur[20];
    private int nombreCoureur;

    public Compétition(String désignationComp, String dateComp) {
        this.désignationComp = désignationComp;
        this.dateComp = dateComp;
    }

    public boolean ajouterCoureur(Etud_Coureur e) {
        boolean ajout = false;
        if (this.nombreCoureur < this.tabEtud.length && !e.getParticipe()) {
            this.tabEtud[this.nombreCoureur] = e;
            this.nombreCoureur++;
            e.setParticipe(true);
            ajout = true;
        }
        return ajout;
    }

    public Etud_Coureur getMedailleOr() {
        Etud_Coureur etud = null;
        int i = 0;

        while (i < this.nombreCoureur && etud == null) {

            if (this.tabEtud[i].getParticipe()) {
                etud = this.tabEtud[i];
            }
            i++;
        }
        while (i < this.nombreCoureur) {
            if (this.tabEtud[i].getParticipe() && this.tabEtud[i].compare(etud)) {
                etud = this.tabEtud[i];
            }
            i++;
        }
        
        return etud;
    }

    public boolean recordBattu() {
        boolean record = false;
        int i = 0;
        while (i < this.nombreCoureur && !record) {
            if (this.tabEtud[i].getParticipe() && this.tabEtud[i].getDuree() < this.RECORD_A_BATTRE) {
                record = true;
            }
            i++;
        }
        return record;
    }

    public void afficher() {
        System.out.println("Compétition : " + this.désignationComp + " - " + this.dateComp);
        System.out.println("Record à battre : " + this.RECORD_A_BATTRE + " secondes");
        System.out.println("Nombre de coureurs : " + this.nombreCoureur);
        for (int i = 0; i < this.nombreCoureur; i++) {
            System.out.println(this.tabEtud[i]);
        }
    }
}
