package ex1;

import java.util.Scanner;

public class Somme {
    public static void main(String args [] ){
        Scanner s = new Scanner(System.in);
        System.out.println("Donner un entier : ");
        int x = s.nextInt();
        int res = 0;
        for( int i = 0; i<=x ; i++ ){
            res += i;
        }
        System.out.println("La Result est " + res);
    }
}
