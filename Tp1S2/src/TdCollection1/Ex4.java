package TdCollection1;

class Paire<T> {

    T x, y;

    Paire(T x1, T y1) {
        x = x1;
        y = y1;
    }

    T first() {
        return x;
    }

    T second() {
        return y;
    }

    void setFirst(T x1) {
        x = x1;
    }

    void setSecond(T y1) {
        y = y1;
    }

    void invert() {
        T temp = x;
        x = y;
        y = temp;
    }

    boolean equals(Paire<T> o) {
        return o.x.equals(x) && o.y.equals(y);
    }

    public String toString() {
        return "" + x + " " + y;
    }
}

public class Ex4 {

    public static void main(String[] args) {
        Paire<String> paire1 = new Paire<String>("premier", "second");
        System.out.println(paire1);
    }
}
