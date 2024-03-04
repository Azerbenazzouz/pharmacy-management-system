package dev;

public class Lanceur {
    private String numEtud;
    private String nom;
    private String prénom;
    private String ville;
    private ResultatLancement résultatLanceur;

    public Lanceur(String numEtud , String ville , ResultatLancement résultatLanceur){
        this.numEtud = numEtud;
        this.ville = ville;
        this.résultatLanceur = résultatLanceur;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public ResultatLancement getRésultat(){
        return this.résultatLanceur;
    }

    public boolean equals(Object o){
        if(o instanceof Lanceur){
            Lanceur l = (Lanceur) o;
            return this.numEtud.equals(l.numEtud);
        }
        return false;
    }

    public void setRésultat(ResultatLancement résultatLanceur){
        this.résultatLanceur = résultatLanceur;
    }

    @Override
    public String toString(){
        return this.numEtud + " " + this.nom + " " + this.prénom + " " + this.ville + " " + this.résultatLanceur.getInformation();
    }

}
