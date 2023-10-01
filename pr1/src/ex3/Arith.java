package ex3;

import java.util.Scanner;

public class Arith {
    public static void main(String args[]){
        float res,n1,n2;
        int ch;
        Scanner s = new Scanner(System.in);

        while(true){
            
            System.out.println("1 - Somme de deux réels\n" +
                               "2 - Soustraction de deux réels\n" +
                               "3 - Multiplication de deux réels \n" +
                               "4 - Division de deux réels\n" +
                               "5 - Sortie du programme");
            
            ch = s.nextInt();
            if (ch>0 && ch>5){
                System.out.println("donner un choix correct : ");
                ch = s.nextInt();
            }
            if(ch==5){
                System.out.println("Goodbye...");
                System.exit(0);
            }
            
            res = 0 ;
            
            System.out.println("Donner Num 1 : ");
            n1 = s.nextFloat();
            System.out.println("Donner Num 2 : ");
            n2 = s.nextFloat();
            
            switch(ch){
                case 1 : {
                    res = n1 + n2;
                    System.out.println(n1+" + "+n2+" = "+res);
                    break;
                }
                case 2 : {
                    res = n1 - n2;
                    System.out.println(n1+" - "+n2+" = "+res);
                    break;
                }
                case 3 : {
                    res = n1 * n2;
                    System.out.println(n1+" * "+n2+" = "+res);
                    break;
                }
                case 4 : {
                    while (n2 == 0){
                        System.out.println("ont peut pas diviseŕsur 0 donner un autre nombre : ");
                        n2 = s.nextFloat();
                    }
                    res = n1 / n2;
                    System.out.println(n1+" / "+n2+" = "+res);
                    break;
                }
                case 5 : {
                    System.out.println("Goodbye...");
                    System.exit(0);
                    break;
                }
                default :
                    break;
            }
        }
    }
}
