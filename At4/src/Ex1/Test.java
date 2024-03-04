package Ex1;

public class Test {
    public static void main(String args[]){
        TéléphoneFacturé TF = new TéléphoneFacturé("04567892", 245789, 71, 0F);
        TéléphonePrépayé TP = new TéléphonePrépayé("04326612", 245789, 75, 0F);
        
        TF.consommer(150F);
        TF.Régler(100F);
        
        TP.Alimenter(10);
        TP.consommer(20);
        TP.consommer(2);
        TF.Afficher();
        TP.Afficher();

        
    }
}
