package Ex1;

public class TéléphonePrépayé extends Téléphone{
    private float Montantrestant;
    
    
    public TéléphonePrépayé(String CinAbonné,int numTel,int Indicatif , float Montantrestant){
        this.CinAbonné = CinAbonné;
        this.numTel = numTel;
        this.Indicatif = Indicatif;
        this.Montantrestant = Montantrestant;
    }
    
    public void consommer(float Montant){
        if(this.Montantrestant >= Montant){
            this.Montantrestant -= Montant;
        }
    }
    
    public float GetMontantRestant(){
        return this.Montantrestant;
    }
    
    public void Alimenter(float Montant){
        this.Montantrestant += Montant;
    }
    
    public void Afficher(){
        super.Afficher();
        System.out.println("J’ai un téléphone prépayé\nLe montant restant est "+this.Montantrestant+" dinars");
    }
}
