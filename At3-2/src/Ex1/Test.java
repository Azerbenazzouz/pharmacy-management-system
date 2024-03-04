package Ex1;

public class Test {
    public static void main(String[] args) {
        Chat Chat1= new Chat("Antar");
        Chat Chat2= new Chat((float) 1.5,5);
        Chat2.setNom("Simou");
        Chat Chat3= new Chat();
        Chat3.setNom("katy");
        Chat3.setPoids(2.5F);
        // Chat1.affiche();
        // Chat3.SetPoids((float)1.5);
        Chat1.affiche();
        Chat2.affiche();
        Chat3.affiche();
    }
}
