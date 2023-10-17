package EX1;


public class Test {
    public static void main(String args[]){
        TelF T1 = new TelF("015050", 56793609, 78, 0);
        TelP T2 = new TelP("015555", 54994496, 79, 0);
        T1.consommer(20);
        T1.Régler(10);
        T2.consommer(5);
        T2.Alimenter(50);
        System.out.println("Le montant restant est " + T2.GetMontantRestant());
        T2.consommer(5);
        System.out.println("Le montant restant est " + T2.GetMontantRestant());
        T2.consommer(500);
        T1.afficher();
        T2.afficher();
    }
}
