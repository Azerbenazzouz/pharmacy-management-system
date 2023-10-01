package Ex1;

public class Compte {

    public int numCompte;
    public String nomProprietaire;
    private float solde;
    
    public void retirer_Argent(float mnt){
        if(mnt > solde){
            System.out.println("votre solde est insifisent....");
        }else{
            solde-=mnt;
            System.out.println("Vous avez retiree "+this.solde);
        }
    }
    public void deposer_Argent(float mnt){
        if(mnt < 0){
            System.out.println("doit etre positif");
        }
        this.solde += mnt;
    }
    public void consulter_Solde(){
        System.out.println("num_Compte : "+this.numCompte + "\n"+
                           "nom_proprietaire : "+this.nomProprietaire + "\n"+
                            "solde : "+this.solde);
    }
}
