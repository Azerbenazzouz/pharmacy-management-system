package Ex2;

public class Produit {

    public final int ref;
    public String Libellé;
    private int qte;
    private float Prixu;
    
    public Produit(int ref , String Libellé){
        this.ref = ref;
        this.Libellé = Libellé;
    }
    
    public Produit(int ref){
        this(ref,"inconnu");
    }
    
    public void SetQuantité(int q){
        this.qte = q;
    }
    
    public int GetQuantité(){
        return this.qte;
    }
    
    public void SetPrix(float prix){
        this.Prixu = prix;
    }
    
    public float GetPrix(){
        return this.Prixu;
    }
    
    public Produit fusion(Produit P){
        Produit Pnv = new Produit(P.ref , this.Libellé + " " + P.Libellé);
        Pnv.SetQuantité(this.qte + P.GetQuantité());
        Pnv.SetPrix( ( this.Prixu*this.qte + P.GetPrix()*P.GetQuantité() ) / Pnv.GetQuantité() );
        return Pnv;
    }
    
    @Override
    public String toString() {
        return "Produit{" + "ref=" + ref + ", Libell\u00e9=" + Libellé + ", qte=" + qte + ", Prixu=" + Prixu + '}';
    }
}
