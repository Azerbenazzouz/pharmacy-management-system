package Ex2;

public class Passager extends Personne{
    private float prixBillet;

    public Passager(String n, String p, int a , float pb){
        super(n , p , a);
        prixBillet = pb;
    }

    public float getPrix() {
        return prixBillet;
    }

    public void reduire(int p){
        prixBillet -= prixBillet * p / 100;
    }

    public void reduire(){
        reduire(1);
    }

    public void setPrixBillet(float pb){
        prixBillet = pb;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Je suis un passager");
        System.out.println("Mon billet coûte " + prixBillet + " dinars");
    }
}
