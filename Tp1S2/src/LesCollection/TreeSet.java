package LesCollection;

import java.util.Iterator;
import java.util.TreeSet;

class Point implements Comparable {

    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object pp) {
        Point p = (Point) pp;// egalite si coordonnees egales
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else if (this.y < p.y) {
            return -1;
        } else if (this.y > p.y) {
            return 1;
        } else {
            return 0;
        }
    }

    public void affiche() {
        System.out.print("[" + x + " " + y + "] ");
    }
}

class EnsPoint {

    public static void main(String args[]) {
        Point p1 = new Point(1, 3), p2 = new Point(2, 2);
        Point p3 = new Point(4, 5), p4 = new Point(1, 8);
        Point p[] = {p1, p2, p1, p3, p4, p3};
        TreeSet<Point> ens = new TreeSet<Point>();
        for (Point px : p) {
            System.out.print("le point ");
            px.affiche();
            boolean ajoute = ens.add(px);
            if (ajoute) {
                System.out.println("a été ajouté ");
            } else {
                System.out.println("est déjà présent");
            }
            System.out.print("ensemble= ");
            affiche(ens);
        }
    }

    public static void affiche(TreeSet<Point> ens) {
        Iterator<Point> iter = ens.iterator();
        while (iter.hasNext()) {
            Point p = iter.next();
            p.affiche();
        }
        System.out.println();
    }
}
