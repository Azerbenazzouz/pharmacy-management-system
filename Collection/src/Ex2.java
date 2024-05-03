import java.util.ArrayList;

class Base{
    public String toString(){
        return "Base";
    }
}
class Direvée extends Base{
    public String toString(){
        return "Direvée";
    }
}

public class Ex2 {
    public static void main(String args[]) {
        ArrayList<Direvée> l1 = new ArrayList<>();
        ArrayList<Base> l2 = new ArrayList<>(l1);
        l2.add(new Direvée());
        System.out.println(l2.get(0));
    }    
}
