package test;

public class Test {
    public static void main(String[] args){
        AgenceLocation A = new AgenceLocation("EliteCar");
        Voiture V1 = new VoitureSport(1 , "Ferrari", 600, 100, "300km/h");
        Voiture V2 = new VoitureDeLuxe(2 , "Jaguar", 500, 100);

        V1.setEtat(Voiture.etatVoiture.DISPONIBLE);
        V2.setEtat(Voiture.etatVoiture.INDISPONIBLE);

        A.ajouterVoiture(V1);
        A.ajouterVoiture(V2);

        Voiture V = A.louerVoiture(00);

        if(V != null){
            System.out.println("Voiture louée : \n" + V.toString());
        }

        for(Voiture v : A.lesVoituresDisponibles()){
            System.out.println(v.toString());
        }

        System.out.println("Marque de la voiture la plus chère : " + A.marqueDeSportLaPlusChère());
    }
}
