package Ex1;

public class Test {
    public static void main(String Args[]){
        Compte A = new Compte();
        A.numCompte = 4576001;
        A.nomProprietaire = "Toumi Youssef";
        A.deposer_Argent(850.175F);
        A.retirer_Argent(100F);
        A.consulter_Solde();
        Compte B;
        B = A;
        B.deposer_Argent(200F);
        B.consulter_Solde();
        A.consulter_Solde();
    }
}
