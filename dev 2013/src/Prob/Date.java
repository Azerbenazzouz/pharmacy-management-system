package Prob;

import java.util.Calendar;

public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date() {
        this.jour = 1;
        this.mois = 1;
        this.annee = 2000;
    }

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    public static Date getDate(){
        int j,m,a;
        j= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        m= Calendar.getInstance().get(Calendar.MONTH)+1;
        a= Calendar.getInstance().get(Calendar.YEAR);
        return new Date(j,m,a);
    }
    
    public int getAnnee(){
        return this.annee;
    }
    public void afficher(){
        System.out.println(jour+"/"+mois+"/"+annee);
    }    
}
