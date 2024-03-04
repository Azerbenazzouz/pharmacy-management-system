package LesCollection;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args){
        LinkedList<Integer> file = new LinkedList<Integer>();
        file.offer(5);
        file.offer(18);
        file.offer(20);
        System.out.println(file);
        System.out.println(file.poll());
    }
}
