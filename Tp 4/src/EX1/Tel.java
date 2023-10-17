package EX1;

public class Tel {
    protected String CinAbonné;
    protected int numeroTel;
    protected int Indicatif;

    public Tel(String cinAbonné, int numeroTel, int indicatif) {
        CinAbonné = cinAbonné;
        this.numeroTel = numeroTel;
        Indicatif = indicatif;
    }

    public void afficher(){
        System.out.println("Mon NCIN est " + CinAbonné);
        System.out.println("Mon numéro de téléphone est " + numeroTel);
        System.out.println("Mon Indicatif est " + Indicatif);    
    }
}
