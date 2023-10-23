package Prob;

public class OEuvre {
    private String titre;
    private String réalisateur;
    private final int annéeAcquisition;
    private int nombreCopiesDisponibles;
    private static int nombreEmprunt;
    private String genre;
    private float tarif;

    public OEuvre(String titre , String réalisateur , String genre , int nombreCopiesDisponibles){
        new Date();
        this.annéeAcquisition = Date.getDate().getAnnee();
        this.tarif = 1;
        this.titre = titre;
        this.réalisateur = réalisateur;
        this.genre = genre;
        this.nombreCopiesDisponibles = nombreCopiesDisponibles;
    }

    public OEuvre(String titre, String réalisateur ){
        this(titre,réalisateur,"drame",1);
    }

    public void setTarif(float tarif){
        this.tarif = tarif;
    }

    public float getTarif(){
        return this.tarif;
    }

    public boolean emprunter(int nb){
        return this.nombreEmprunt >= nb ;
    }

    public boolean comparer(OEuvre o){
        return this.titre.equals(o.titre) && this.réalisateur.equals(o.réalisateur);
    }

    public void afficher(){
        System.out.println(this.titre+","+this.réalisateur+","+this.annéeAcquisition+","+this.nombreCopiesDisponibles+","+this.nombreEmprunt+","+this.genre+","+this.tarif);
    }

}
