
package Ex1;

public class Téléphone {
    protected String CinAbonné;
    protected int numTel;
    protected int Indicatif;
    
    public void Afficher(){
        System.out.println("Mon NCIN est "+this.CinAbonné);
        System.out.println("\nMon numéro de téléphone est "+this.numTel);
        System.out.println("\nMon Indicatif est "+this.Indicatif);
        
        //System.out.println("Cin : "+this.CinAbonné+"\nTel : "+this.numTel+"\nIndicatif : "+this.Indicatif);
    }
}
