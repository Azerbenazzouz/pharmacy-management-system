package Comptabilité;

public class Facture implements Comparable<Facture>{
    private int num;
    private float montantHorsTaxe;
    private float TVA;
    
    public float calculMontant(){
         return (this.montantHorsTaxe *(100+this.TVA)/100);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getMontantHorsTaxe() {
        return montantHorsTaxe;
    }

    public void setMontantHorsTaxe(float montantHorsTaxe) {
        this.montantHorsTaxe = montantHorsTaxe;
    }

    public float getTVA() {
        return TVA;
    }

    public void setTVA(float TVA) {
        this.TVA = TVA;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Facture other = (Facture) obj;
        if (this.num != other.num) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Facture F) {
        return Float.compare(this.calculMontant(), F.calculMontant());
    }
    
    
}
