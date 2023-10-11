package Ex1;

public class Etudiant {
    private int matricule;
    private String nom;
    private String prenom;
    private String groupe;

    public Etudiant(int matricule, String nom, String prenom, String groupe) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }
    @Override public String toString(){
        return "Matricule : " + matricule + "\nNom : " + nom + "\nPrenom : " + prenom + "\nGroupe : " + groupe;
    }
    
    public void setNomPrenom(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setGroupe(String groupe){
        this.groupe = groupe;
    }

}

