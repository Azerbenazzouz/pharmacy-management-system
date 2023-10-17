package Ex3;

public class Materiel {
    private String ref;
    private int quantite;
    private float prixAchat;
    protected float prixVente;
    private Fournisseur leFournisseur;

    public Materiel(String r, float pa) {
        ref = r;
        prixAchat = pa;
        prixVente = pa * 1.3f;
    }

    @Override
    public String toString() {
        return this.ref + " " + this.prixAchat + " " + this.prixVente + " " + this.quantite + " " + this.leFournisseur.toString();
    }

    public void livrer(int q){
        if (q >= quantite){
            this.quantite -= q;
        }else{
            System.out.println("Quantité insuffisante");
        }
    }

    public void stocker(int q){
        this.quantite += q;
    }

    public void fournir(Fournisseur f){
        this.leFournisseur = f;
    }
}
