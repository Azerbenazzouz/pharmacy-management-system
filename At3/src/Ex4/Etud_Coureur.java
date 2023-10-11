package Ex4;

public class Etud_Coureur {
    private int numEtud;
    private static int nombre;
    private String nomPrenom;
    private boolean aDejaParticipe;
    private int duree;

    public Etud_Coureur(String nomPrenom) {
        this.numEtud = ++nombre;
        this.nomPrenom = nomPrenom;
        this.aDejaParticipe = false;
        this.duree = 0;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    public boolean getParticipe() {
        return this.aDejaParticipe;
    }
    
    public void setParticipe(boolean aDejaParticipe) {
        this.aDejaParticipe = aDejaParticipe;
    }

    public boolean compare(Etud_Coureur etud) {
        return this.duree < etud.duree;
    }

    @Override
    public String toString() {

        if (this.aDejaParticipe) {
            return "Etudiant " + this.numEtud + " : " + this.nomPrenom + " - " + this.duree + "s - a déjà participé";
        }else{
            return "Numéro étudiant : " + this.numEtud + " - " + this.nomPrenom ;
        }
    }
}
