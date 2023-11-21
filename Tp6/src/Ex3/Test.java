package Ex3;

public class Test {
    public static void main(String args[]){
        Jeu Jeu1 = new Jeu("Grand huit" , 8 , new ConditionAge(15));
        Jeu Jeu2 = new Jeu("Chenille" , 5 , new ConditionTaille(1.2f));
        Personne P = new Personne("Bennour" , 16 , 1.62f);
        
        Jeu1.utilise(P);
        Jeu2.utilise(P);

        Jeu1.afficheJeu();
        Jeu2.afficheJeu();
        
    }

}
