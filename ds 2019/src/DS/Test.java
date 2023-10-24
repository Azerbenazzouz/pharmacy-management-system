package DS;

import java.util.Scanner;

import DS.Consultation.Typelogie;

public class Test {
    public static void main(String args[]){
        Scanner scI = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        
        Medecin M1 = new Medecin(12345, "Mohamed Ghorbel", "Dentaire", 40);
        Medecin M2 = new Medecin(56789, "Mohssen Taktak", "Cardio", 70);
        Consultation C;
        System.out.println("Donner le code Consultation : ");
        int codeCons = scI.nextInt();
        System.out.println("Donner le nom et prenom du patient : ");
        String nomPrePatient = scS.nextLine();
        System.out.println("Donner le regime du patient : ");
        String regimeCnamPatient = scS.nextLine();
        if(regimeCnamPatient.equalsIgnoreCase("Rembourse")){
            C = new Consultation(codeCons, nomPrePatient, Typelogie.Rembourse);
        }else if(regimeCnamPatient.equalsIgnoreCase("MedecinDeFamille")){
            C = new Consultation(codeCons, nomPrePatient, Typelogie.MedecinDeFamille);
        }else{
            System.out.println("Erreur");
            return;
        }
        System.out.println("================================================================");
        C.affecterMédecin(M2);
        C.calculerTarifCons();
        C.afficher();
    }
}
