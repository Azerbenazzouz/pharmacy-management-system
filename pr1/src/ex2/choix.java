package ex2;

public class choix {
    public static void main(String args []){
        int ch = Integer.parseInt(args[0]);
        switch(ch){
            case 0 : {
                System.out.println("null");
                break;
            }
            case 1 :case 2 : {
                System.out.println("petit");
                break;
            }
            case 3 : case 4 : case 5 : {
                System.out.println("moyen");
                break;
            }
            default : {
                if ( ch>0 ) {
                    System.out.println("grand");
                } else {
                    System.out.println("negative");
                }
            }
        }
    }
}
