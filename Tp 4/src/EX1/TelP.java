package EX1;

public class TelP extends Tel {
    private float montAR;
    public TelP(String cinAbonné, int numeroTel, int indicatif , float mr) {
        super(cinAbonné, numeroTel, indicatif);
        this.montAR = mr;
    }
    public void consommer(float mont){
        if(montAR >= mont){
            montAR -= mont;
        }
        else{
            System.out.println("Le montant est insuffisant");
        }
    }
    public float GetMontantRestant(){
        return montAR;
    }

    public void Alimenter(float mont){
        montAR += mont;
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("J’ai un téléphone prépayé"+"Le montant restant est " +(int) montAR + " dinars");
    }
}
