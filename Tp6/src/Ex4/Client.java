package Ex4;

import java.util.ArrayList;
import java.util.List;

class PersonneID implements Identité{
    private String nom;
    private String prenom;

    public PersonneID(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String sePrésenter() {
        return this.nom + " " + this.prenom;
    }

    @Override
    public boolean comparer(Object o) {
        if(o instanceof PersonneID){
            PersonneID p = (PersonneID) o;
            return this.nom.equals(p.nom) && this.prenom.equals(p.prenom);
        }
        return false;
    }

}

class EntrpriseID implements Identité{
    private String raisonSociale;
    private PersonneID responsable;

    public EntrpriseID(String raisonSociale, PersonneID responsable){
        this.raisonSociale = raisonSociale;
        this.responsable = responsable;
    }

    @Override
    public String sePrésenter() {
        return this.raisonSociale;
    }

    @Override
    public boolean comparer(Object o) {
        if( o instanceof EntrpriseID){
            EntrpriseID e = (EntrpriseID) o;
            return this.raisonSociale.equals(e.raisonSociale) && this.responsable.comparer(e.responsable);
        }
        return false;
    }

}


public class Client {
    private String adresse;
    private Identité identitéClt;

    public Client(String adresse, Identité identitéClt){
        this.adresse = adresse;
        this.identitéClt = identitéClt;
    }

    public Identité getIdentiteClt(){
        return this.identitéClt;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public void afficher_Client(){
        System.out.println("Adresse : " + this.adresse + "\n"+
                            "Identité : " + this.identitéClt.sePrésenter());
    }

}

class AgenceBancaire{
    private String nomAgence;
    private List<Client> tabClient = new ArrayList<Client>();
    
    public AgenceBancaire(String nomAgence){
        this.nomAgence = nomAgence;
    }

    public void ajouterClient( Client nv){
        this.tabClient.add(nv);
    }

    public Client getClient(Identité id){
        for(Client c : this.tabClient){
            if(c.getIdentiteClt().comparer(id)){
                return c;
            }
        }
        return null;
    }

}


class Test{
    public static void main(String[] arges){
        AgenceBancaire Ag = new AgenceBancaire("Agence 2012");
        PersonneID p1 = new PersonneID("bahri", "mohamed");
        PersonneID p2 = new PersonneID("bahri", "mohamed");
        EntrpriseID e1 = new EntrpriseID("SOTUCO SARL", p2);
        Client c1 = new Client("Bizerte", p1);
        Client c2 = new Client("Tunis" , e1 );
        Ag.ajouterClient(c1);
        Ag.ajouterClient(c2);
        Ag.getClient(p1).afficher_Client();
        Ag.getClient(e1).afficher_Client();

    }
}