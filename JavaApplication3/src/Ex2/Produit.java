package Ex2;

public class Produit {
    public final int ref;
    public String lib;
    private int qte;
    private double prix;

    public Produit( int ref , String lib ) {
        this.lib = lib;
        this.ref = ref;
    }

    public Produit( int ref ){
        this( ref , "Inconnu" );
    }
    
    // SetQuantité ()
    public void setQte(int qte) {
        this.qte = qte;
    }
    // +GetQuantité ()
    public int getQte() {
        return qte;
    }
    // +SetPrix()
    public void setPrix(double prix) {
        this.prix = prix;
    }
    // +GetPrix()
    public double getPrix() {
        return prix;
    }
    // +fusion ()
    public Produit fusion(Produit p) {
        Produit res = new Produit( this.ref , this.lib +" "+ p.lib );
        res.setQte( this.qte + p.qte );
        res.setPrix( (this.prix * this.qte + p.prix * p.qte) / (this.qte + p.qte) );
        return res;
    }
    // + Affiche()
    public void affiche() {
        System.out.println("Libellé : " + lib);
        System.out.println("Référence : " + ref);
        System.out.println("Quantité : " + qte);
        System.out.println("Prix : " + prix);
    }


}
