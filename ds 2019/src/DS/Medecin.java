package DS;

public class Medecin {
    public final int codeCnam;
    private String nomPrenom;
    private String specialite;
    public float tarif;
    private float recette;
    private int nb_Cons;
    
    public Medecin(int codeCnam, String nomPrenom, String specialite, float tarif) {
        this.codeCnam = codeCnam;
        this.nomPrenom = nomPrenom;
        this.specialite = specialite;
        this.tarif = tarif;
        this.recette = 0;
        this.nb_Cons = 0;
    }
    
    public Medecin(String nomPrenom, String specialite, float tarif) {
        this(0,nomPrenom,specialite,tarif);
    }
    public float getRecette(){
        return recette;
    }

    public void setRecette(float recette){
        this.recette += recette;
    }

    public int getNbCons(){
        return nb_Cons;
    }

    public void setNb_Cons(){
        this.nb_Cons++;
    }

    public boolean verifier(Medecin m){
        return this.codeCnam == m.codeCnam && this.nomPrenom.equals(m.nomPrenom);
    }

    @Override
    public String toString(){
        return "Code Cnam: " + codeCnam + "\nNom et Prenom: " + nomPrenom + "\nSpecialite: " + specialite + "\nTarif: " + tarif + "\nRecette: " + recette + "\nNombre de consultations: " + nb_Cons;
    }
}
