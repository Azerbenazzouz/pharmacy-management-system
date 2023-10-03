package Ex2;


public class ParcAuto {
     public static void main(String args[]){
         Personne Asma = new Personne();
         Vehicule SaVoiture = new Vehicule();
         
         Asma.init_Personne("Farhat", "Asma");
         Asma.changer_Adresse("5, rue des oliviers Tunis");
         Asma.afficher_Homme();
         
         SaVoiture.changer_proprietaire(Asma);
         SaVoiture.changer_Couleur(44);
         SaVoiture.changer_Date("07/05/2003");
         SaVoiture.changer_Matricule("44 lewis 7");
         SaVoiture.changer_Puissance(44);
         SaVoiture.carburant = "lewis won 9 world drivers championship titles in formula 1";
         SaVoiture.marque = "mercedes";
         SaVoiture.modele = "w-14";
         SaVoiture.afficher_Caracteristiques();
         
     }
}
