package Ex2;

public class Test {
    public static void main(String args[]){
        Produit Verre1 = new Produit(120,"verre V225");
        Produit Verre2 = new Produit(125,"verre V220");
        
        Verre1.SetQuantité(12000);
        Verre2.SetQuantité(50000);
        Verre1.SetPrix(0.125F);
        Verre2.SetPrix(0.1F);

        Produit Verre3 = Verre1.fusion(Verre2);
        
        System.out.println(Verre1.toString());
        System.out.println(Verre2.toString());
        System.out.println(Verre3.toString());

    }
}
