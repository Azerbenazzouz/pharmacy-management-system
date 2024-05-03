
import java.util.*;

class Ex1 {

    public static void main(String args[]) {
        LinkedList<Integer> liste = new LinkedList<Integer>();
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(12);
        liste.add(3);
        System.out.println(liste);
        liste.remove(3);
        System.out.println(liste);
        liste.remove(new Integer(3));
        System.out.println(liste);
        Iterator<Integer> it = liste.iterator();
        while (it.hasNext()) {
            if (it.next() == 3) {
                it.remove();
            }
        }
        System.out.println(liste);
    }
}
