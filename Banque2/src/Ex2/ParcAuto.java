package Ex2;

public class ParcAuto {
    public static void main(String Args[]){
        Personne Asma = new Personne();
        Véhicule Savoiture = new Véhicule();
        Asma.int_Personne("Farhat", "Asma", " 5, rue des oliviers Tunis");
        Savoiture.changer_Matricule("6200TU102");
        Savoiture.marque = "Ford";
        Savoiture.modèle = "Fiesta";
        Savoiture.changer_Puissance(4);
        Savoiture.affecter_proprietaire(Asma);
        Savoiture.afficher_Caracteristiques();
        Asma.afficher_Homme();
    }
    
}
