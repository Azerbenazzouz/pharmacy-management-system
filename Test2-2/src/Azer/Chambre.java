package Azer;

public class Chambre {
    public enum TypeChambre {
        VIP , SINGLE , TRIPLE
    }
    private int num;
    private TypeChambre type;
    private float prix;

    public Chambre( int num , TypeChambre type , float prix ){
        this.num = num;
        this.type = type;
        this.prix = prix;
    }

    // getters
    public int getNum(){
        return this.num;
    }
    public TypeChambre getType(){
        return this.type;
    }
    public float getPrix(){
        return this.prix;
    }
    // setters
    public void setNum( int num ){
        this.num = num;
    }
    public void setType( TypeChambre type ){
        this.type = type;
    }
    public void setPrix( float prix ){
        this.prix = prix;
    }
    // equals
    public boolean equals( Object o ){
        if( o instanceof Chambre ){
            Chambre c = (Chambre) o;
            return this.num == c.num && this.type == c.type;
        }
        return false;
    }
    // toString
    @Override
    public String toString(){
        return "Chambre : numero : " + this.num + " Type : " + this.type + " Prix : " + this.prix + " dinars";
    }
}
