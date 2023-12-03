package javaapplication17;

class Test {
    public static void main(String[] ARGS) {
        try {
            System.out.println("AVANT A");
            A();
            System.out.println("Apres A");
        } catch (Exception e) {
            System.out.println("MAIN : " + e);
        } finally {
            System.out.println("MAIN : FINALLY");
        }
    }

    public static void A() {
        try {
            System.out.println("AVANT b");
            b();
            System.out.println("Apres b");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("A : index hors limite");
        } finally {
            System.out.println("A : FINALLY");
        }
    }

    public static void b() {
        try {
            int TAB[] = new int[4];
            TAB[10] = 10 / 3; // Erreur : index hors limite
        } catch (ArithmeticException e) {
            System.out.println("b : Erreur de CALCUL");
        } finally {
            System.out.println("b : FINALLY");
        }
    }
}