package LesCollection;
import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<Integer> pile = new Stack<Integer>();
        pile.push(5);
        pile.push(18);
        pile.push(20);
        System.out.println(pile);
        System.out.println(pile.pop());
    }
}
