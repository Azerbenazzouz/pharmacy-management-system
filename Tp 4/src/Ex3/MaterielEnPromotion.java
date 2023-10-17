package Ex3;

public class MaterielEnPromotion extends Materiel{
    private String typeDePromo;
    private int pourcentageReduction;

    public MaterielEnPromotion(String r, float pa, String t, int p) {
        super(r, pa);
        typeDePromo = t;
        pourcentageReduction = p;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.typeDePromo + " " + this.pourcentageReduction;
    }

    public float CalculPrixReduit(){
        return this.prixVente * (1 - pourcentageReduction/ 100);
    }
    
    public boolean appartenirPromotion(String type){
        return this.typeDePromo.equals(type);
    }
}
