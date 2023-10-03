package Ex2;

public class Test {
    public static void main(String args[]){
        Produit Verre1 = new Produit( 120 , "verre V225" );
        Verre1.setQte(12000);
        Verre1.setPrix(0.125);
        Produit Verre2 = new Produit( 125 , "verre V220" );
        Verre2.setQte(50000);
        Verre2.setPrix(0.100);
        Produit Verre3 = Verre1.fusion(Verre2);
        Verre3.affiche();
    }
}
