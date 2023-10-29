package DS;

public class Consultation {
    enum Typelogie {
        Rembourse,
        MedecinDeFamille
    }

    private int codeCons;
    private String nomPrePatient;
    private Date dateCons;
    private Medecin leMedecin;
    private Typelogie regimeCnamPatient;

    public Consultation(int codeCons , String nomPrePatient , Typelogie regimeCnamPatient){
        this.codeCons = codeCons;
        this.nomPrePatient = nomPrePatient;
        this.regimeCnamPatient = regimeCnamPatient;
        this.dateCons = Date.getDate();
    }

    public void affecterMédecin(Medecin m){
        if(m.getNbCons() < 10){
            this.leMedecin = m;
            m.setNb_Cons();
            m.setRecette(calculerTarifCons());
        }
    }

    public float calculerTarifCons(){
        if (this.leMedecin.codeCnam != 0) {
            if (this.regimeCnamPatient == Typelogie.MedecinDeFamille)
                return leMedecin.tarif / 2;
        }
        return leMedecin.tarif;
    }

    public void afficher() {
        System.out.println("Nom et Prenom : " + nomPrePatient + "\nDate consultation : " + dateCons.toString() + "\n"
                + this.leMedecin.toString());
    }
}
