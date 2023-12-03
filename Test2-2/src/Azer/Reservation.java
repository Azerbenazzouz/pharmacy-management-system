package Azer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Reservation {
    // private Date date;
    private Calendar date;
    private int numero;
    private List<Chambre> LesChambres = new ArrayList<Chambre>();

    public Reservation( Calendar date , int numero ){
        this.date = date;
        this.numero = numero;
    }

    // getters
    public Calendar getDate(){
        return this.date;
    }
    public int getNumero(){
        return this.numero;
    }
    // setters
    public void setDate( Calendar date ){
        this.date = date;
    }
    public void setNumero( int numero ){
        this.numero = numero;
    }
    // chercher
    public boolean chercher( Chambre chambre ){
        for( Chambre c : this.LesChambres ){
            if( c.equals( chambre ) ){
                return true;
            }
        }
        return false;
    }
    // ajouter
    public void ajouter( Chambre c ){
        if( !this.chercher( c ) ){
            this.LesChambres.add( c );
        }
    }
    // toString
    @Override
    public String toString(){
        String s = "Reservation : numero : " + this.numero + " Date : " + this.date.getTime() + "\n";
        for( Chambre c : this.LesChambres ){
            s += c.toString() + "\n";
        }
        return s;
    }
    
}

