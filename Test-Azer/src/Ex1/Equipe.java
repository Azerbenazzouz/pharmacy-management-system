package Ex1;

import java.util.Scanner;

// classe Stade :
class Stade {
    private String nomStade;
    private Boolean etat;

    public Stade(String nomStade, Boolean etat) {
        this.nomStade = nomStade;
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "nomStade : " + this.nomStade + "\n etat : " + (this.etat ? "Disponible" : "Indisponible");
    }

    public Boolean getEtat() {
        return this.etat;
    }

}

// classe Equipe :
class Equipe {
    private String nomEquipe;
    private String entraineur;

    public Equipe(String nomEquipe, String entraineur) {
        this.nomEquipe = nomEquipe;
        this.entraineur = entraineur;
    }

    @Override
    public String toString() {
        return "nomEquipe : " + this.nomEquipe + "\n entraineur : " + this.entraineur;
    }

    public Stade affecterStade(Stade stade) {
        return null;
    }

}

// classe EquipeDiv1 :
class EquipeDiv1 extends Equipe {
    private Stade stadePrincipale;
    private String medecin;

    public EquipeDiv1(String nomEquipe, String entraineur, String medecin) {
        super(nomEquipe, entraineur);
        this.medecin = medecin;
    }

    public Stade affecterStade(Stade stade) {
        if (stade.getEtat()) {
            this.stadePrincipale = stade;
            return stade;
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "\n medecin : " + this.medecin + "\n stadePrincipale : " + this.stadePrincipale;
    }

}

// classe EquipeDiv2 :
class EquipeDiv2 extends Equipe {
    private Stade[] tabStade = new Stade[3];

    public EquipeDiv2(String nomEquipe, String entraineur, Stade[] tabStade) {
        super(nomEquipe, entraineur);
        this.tabStade = tabStade;
    }

    public Stade affecterStade(Stade stade) {
        for (Stade S : tabStade) {
            if (S.getEtat()) {
                return S;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String str = super.toString();
        int i = 0;
        for (Stade S : tabStade) {
            if (S != null) {
                str += "\n stade numero " + i + " : " + S;
            }
            i++;
        }
        return str;
    }
}

class Test {
    public static void main(String[] args) {
        // declaration des variables :
        Equipe tabEquipe[] = new Equipe[2];
        Stade tabStade[] = new Stade[3];
        Scanner Clavier = new Scanner(System.in);

        // // remplissage de tableaux stade :
        String nomStade;
        Boolean etatStade;
        for (int x = 0; x < tabStade.length; x++) {
            System.out.println("Donner le nom du stade " + x + " : ");
            nomStade = Clavier.next();
            System.out.println("Donner l'etat du stade (true) (false) : ");
            etatStade = Clavier.nextBoolean();
            tabStade[x] = new Stade(nomStade, etatStade);
        }

        // remplissage de tableaux equipe 1 :
        System.out.println("Donner le nom de l'equipe 1 : ");
        String nomEquipe = Clavier.next();
        System.out.println("Donner le nom de l'entraineur de l'equipe 1 : ");
        String entraineurEquipe = Clavier.next();
        System.out.println("Donner le nom du medecin de l'equipe 1 : ");
        String medecinEquipe = Clavier.next();
        tabEquipe[0] = new EquipeDiv1(nomEquipe, entraineurEquipe, medecinEquipe);

        // remplissage de tableaux equipe 2 :
        System.out.println("Donner le nom de l'equipe 2 : ");
        nomEquipe = Clavier.next();
        System.out.println("Donner le nom de l'entraineur de l'equipe 2 : ");
        entraineurEquipe = Clavier.next();
        tabEquipe[1] = new EquipeDiv2(nomEquipe, entraineurEquipe, tabStade);

        // affectation des stades equipe 1:
        System.out.println("Donner le num du stade principale equipe 1  (0) (1) (2): ");
        int numStade = Clavier.nextInt();

        Stade stade = tabEquipe[0].affecterStade(tabStade[numStade]);
        if (stade != null) {
            System.out.println("Stade div1 affecter avec succes : " + stade.toString());
            System.out.println("==================================");

        } else {
            System.out.println("Stade div1 non affecter");
        }

        // affectation des stades equipe 2:
        System.out.println("Donner le num du stade principale equipe 2  (0) (1) (2): ");
        numStade = Clavier.nextInt();

        stade = tabEquipe[1].affecterStade(tabStade[numStade]);

        if (stade != null) {
            System.out.println("Stade div2 affecter avec succes " + stade.toString());
            System.out.println("==================================");

        } else {
            System.out.println("Stade div2 non affecter");
        }

        // affichage des equipes :
        System.out.println("Equipe 1 : \n" + tabEquipe[0].toString());
        System.out.println("Equipe 2 : \n" + tabEquipe[1].toString());

    }
}
