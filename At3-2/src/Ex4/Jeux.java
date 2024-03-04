package Ex4;

public class Jeux {
    public static int nombre;
    public int nb;
    
    public Jeux(int i) {
        System.out.println("1 "+this.nombre + " .. "+ this.nb);
        nombre++;
        nb=nombre+i;
        System.out.println("2 "+this.nombre + " .. "+ this.nb);

    }
}
