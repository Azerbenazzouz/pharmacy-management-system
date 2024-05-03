package Importation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FichierEtudient {
    private String Repertoire;
    private String nomFichier;

    public FichierEtudient(String Repertoire, String nomFichier) {
        this.Repertoire = Repertoire;
        this.nomFichier = nomFichier;
    }
    
    public TreeSet<Etudient> importer(){
        TreeSet<Etudient> r = new TreeSet<>();
        
        File leRepertoire = new File(Repertoire);
        File leFichier;
        
        if(leRepertoire.isDirectory()){
            leFichier = new File(leRepertoire,nomFichier);
        }else{
            leFichier = new File(nomFichier);
        }
        
        try{
            FileReader fr = new FileReader(leFichier);
            BufferedReader entree = new BufferedReader(fr);
            
            String ligne = null;
            StringTokenizer st;
            String nom , prenom;
            Etudient e;
            do{
                ligne = entree.readLine();
                
                if(ligne != null){
                    st = new StringTokenizer(ligne);
                    
                    nom = st.nextToken("\t");
                    prenom = st.nextToken("\t");
                    
                    e = new Etudient(nom, prenom);
                    r.add(e);
                }
                
            }while(ligne != null);
            
            entree.close();
            
        }catch(FileNotFoundException ex){
            System.out.println("Fichier non trouver : "+ex.getMessage());
        }catch(IOException ex){
            System.out.println("Fermeture impossible : "+ex.getMessage());
        }
        
        return r;
    };
}
