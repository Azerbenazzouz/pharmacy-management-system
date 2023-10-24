package DS;

import java.util.Calendar;

public class Date {
    private int jour;
    private int mois;
    private int annee;
    
    private Date(int j, int m, int a){
        jour = j;
        mois = m;
        annee = a;
    }

    public static Date getDate(){
        Calendar c = Calendar.getInstance();
        int j,m,a;
        j = c.get(Calendar.DAY_OF_MONTH);
        m = c.get(Calendar.MONTH)+1;
        a = c.get(Calendar.YEAR);
        return new Date(j,m,a);
    }

    // public int getAnnee() {
    //     return annee;
    // }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }
}
