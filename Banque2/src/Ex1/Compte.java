package Ex1;

public class Compte {
    public int numCompte;
    public String nomProprietaire;
    private float solde;
    
    public void retirer_Argent(float montant){
        if(montant <= solde ){
            this.solde -= montant;
        }else{
            System.out.println("Solde insuffisant....");
        }
    }
    
    public void deposer_Argent(float montant){
        this.solde += montant;
    }
    
    public void consulter_Solde(){
        System.out.println("votre solde : "+this.solde);
    }
}
