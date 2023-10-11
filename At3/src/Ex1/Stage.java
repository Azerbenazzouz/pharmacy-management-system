package Ex1;

public class Stage {
    private int numStage;
    private static int nbStage;
    private Etudiant etud;
    private Date dateSoutenance;
    private float noteSoutenance;
    private float noteRapport;
    private String entreprise;

    public Stage(Etudiant e, String entreprise, float ns, float nr) {
        this.numStage = ++nbStage;
        this.etud = e;
        this.entreprise = entreprise;
        this.noteSoutenance = ns;
        this.noteRapport = nr;
    }

    public void setDateSoutenance(Date dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public void setResultat(float noteRapport, float noteSoutenance) {
        this.noteRapport = noteRapport;
        this.noteSoutenance = noteSoutenance;
    }

    public boolean estValide() {
        return (noteSoutenance * 0.4 + noteRapport * 0.6) >= 10;
    }

    public void affiche() {
        System.out.println("Stage n°" + numStage);
        System.out.println("Etudiant : " + etud.toString());
        System.out.println("Date de soutenance : " + dateSoutenance.toString());
        System.out.println("Note de soutenance : " + noteSoutenance);
        System.out.println("Note de rapport : " + noteRapport);
    }

}
