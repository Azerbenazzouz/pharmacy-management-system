package Ex3;

import jdk.nashorn.internal.objects.NativeArray;

public class Test {
    public static void main(String Args[]){
        Personne[] TabP = new Personne[3];
        TabP[0] = new Personne("Ben Azzouz", "Azer");
        TabP[1] = new Personne("Ben Azzouz1", "Azer");
        TabP[2] = new Personne("Ben Azzouz2", "Azer");
        
        for(Personne P : TabP){
            P.sePresenter();
        }
        
    }
}
