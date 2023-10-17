package EX1;

public class TelF extends Tel{
    private float montAF;
    
    public TelF(String cinAbonné, int numeroTel, int indicatif , float mf) {
        super(cinAbonné, numeroTel, indicatif);
        this.montAF = mf;
    }

    public void consommer(float C) {
        montAF += C;
    }

    public void Régler(float P) {
        montAF -= P;
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("J’ai un téléphone facturé"+
                           "Le montant à payer est " +(int) montAF + " dinars");
    }
    
}
