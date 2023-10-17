package Ex3;

public class Test {
    public static void main(String[] args) {
        Fournisseur F1 = new Fournisseur("Scoop Info", "Ezahra");
        MaterielEnPromotion MP = new MaterielEnPromotion("M1 ordinateur", 1000, "Remise à la caisse" , 30);

        MP.stocker(7);
        MP.fournir(F1);
        System.out.println(MP.toString());
    }
}
