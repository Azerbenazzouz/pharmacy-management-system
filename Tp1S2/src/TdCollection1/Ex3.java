package TdCollection1;
import java.util.Stack;

class Pilegeneric<E> {

    Stack<E> pile = new Stack<E>();

    public E pop() {
        E obj = pile.pop();
        return obj;
    }

    public void push(E obj) {
        pile.push(obj);
    }
}

public class Ex3 {

    public static void main(String args[]) {
        Pilegeneric<String> pg = new Pilegeneric<String>();
        pg.push("Hello");
        pg.push("L2DSI");
        System.out.println(pg.pop());
        Pilegeneric<Integer> pg2 = new Pilegeneric<Integer>();
        pg2.push(44);
        System.out.println(pg2.pop());
    }
}
