package Ex2;

public class Test {
    public static void main(String[] args){
        Passager P1 = new Passager("Maala", "Khaled", 25, 400);
        Personnel P2 = new Personnel("Selmi", "Ahmed", 40);
        
        P1.reduire(10);
        P1.afficher();
        P2.augmenter(10);
        P2.afficher();
    }

    
}
