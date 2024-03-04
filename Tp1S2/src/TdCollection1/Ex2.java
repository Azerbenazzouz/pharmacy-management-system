package TdCollection1;

import java.util.*;

class Base {

    public String toString() {
        return "Base";
    }
}

class Derivée extends Base {

    public String toString() {
        return "Derivee ";
    }
}

public class Ex2 {

    public static void main(String args[]) {
        ArrayList<Derivée> l1 = new ArrayList<Derivée>();
        ArrayList<Derivée> l2 = l1;
        l2.add(new Derivée());
        System.out.println(l1.get(0));
    }

}
