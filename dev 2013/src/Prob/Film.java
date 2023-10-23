package Prob;

public class Film extends OEuvre{
    private int durée;
    private String typeSupport;

    public Film(String titre , String réalisateur , int nombreCopiesDisponibles , String genre , int durée){
        super(titre,réalisateur,genre,nombreCopiesDisponibles);
        this.durée = durée;
        this.typeSupport = "CD";
    }

    public Film(String titre , String réalisateur){
        super(titre,réalisateur);
        this.durée = 0;
    }

    public void setTypeSupport(String typeSupport){
        switch(typeSupport){
            case "CD":
                this.typeSupport = typeSupport;
                super.setTarif(1);
                break;
            case "DVD":
                this.typeSupport = typeSupport;
                super.setTarif(2);
                break;
            case "cassette":
                this.typeSupport = typeSupport;
                super.setTarif(3);
                break;
            default:
                System.out.println("Type de support non reconnu");
        }
    }

    public void afficher(){
        super.afficher();
        System.out.println(this.durée+","+this.typeSupport);
    }
}
