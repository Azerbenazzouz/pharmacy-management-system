/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2s2td1.Ex1;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Ex1 {
    public static void main (String args[]){

        LinkedList<Integer> liste = new LinkedList<Integer>();
        
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(12);
        liste.add(3);
        
        System.out.println(liste); // [3, 5, 3, 12, 3]
        liste.remove(3);
        System.out.println(liste); // [3, 5, 3, 3]
        liste.remove(new Integer(3));
        System.out.println(liste); // [5, 3, 3]
        Iterator <Integer> it = liste.iterator();
        while(it.hasNext()){
            if(it.next()==3){
                it.remove();
            }
        }
        System.out.println(liste); // [5]
    }
}
