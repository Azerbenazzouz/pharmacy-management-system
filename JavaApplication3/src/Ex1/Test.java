package Ex1;
public class Test{
    public static void main(String args[]){
        Chat chat1 = new Chat("Antar");
        Chat chat2 = new Chat((float) 1.5, 5);
        chat2.setNom("Simou");
        Chat chat3 = new Chat();
        chat3.setNom("katy");
        chat3.setPoids((float) 1.5);
        
        chat1.affiche();
        chat2.affiche();
        chat3.affiche();

    }
}