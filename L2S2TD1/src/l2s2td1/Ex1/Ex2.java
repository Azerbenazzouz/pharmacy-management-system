/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2s2td1.Ex1;

import java.util.*;

class Base {
    public String toString(){
        return "Base";
    }
}

class Derivée extends Base {
    public String toString(){
        return "Derivee";
    }
}
public class Ex2 {
    public static void main(String[] Args){
        ArrayList<Derivée> l1 = new ArrayList<Derivée>();
        ArrayList<Base> l2 = l1;
        l2.add(new Base());
        System.out.println(l1.get(0));
    }
}
