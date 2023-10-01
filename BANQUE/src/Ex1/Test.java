
package Ex1;

public class Test {
    public static void main(String args[]){
        Compte A = new Compte();
        
        A.numCompte = 4576001;
        A.nomProprietaire = "Lewis hamilton";
        
        A.deposer_Argent((float)444.7);
        A.retirer_Argent(100);
        A.consulter_Solde();
        
        Compte B ;
        B = A;
        B.consulter_Solde();
    }
    
}
