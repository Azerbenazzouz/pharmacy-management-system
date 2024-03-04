package Ex1;

public class TéléphoneFacturé extends Téléphone{
    private float Montantàfacturer;
    
    public TéléphoneFacturé(String CinAbonné,int numTel,int Indicatif , float Montantàfacturer){
        this.CinAbonné = CinAbonné;
        this.numTel = numTel;
        this.Indicatif = Indicatif;
        this.Montantàfacturer = Montantàfacturer;
    }
    
    public void consommer(float Montant){
        this.Montantàfacturer += Montant;
    }
    
    public void Régler(float Montant){
        this.Montantàfacturer -= Montant;
    }
    @Override
    public void Afficher(){
        super.Afficher();
        System.out.println("J’ai un téléphone facturé\nLe montant à payer est "+this.Montantàfacturer+" dinars");
    }
    
    
}
