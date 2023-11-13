package Polymorphisme;

public class Livrotheque {
    private Livre[] documents;

    public Livrotheque(int capacite) {
        this.documents = new Livre[capacite];
    }

    public void afficherDocuments(){
        for(Livre doc : documents){
            if(doc != null){
                System.out.println(doc.toString());
                System.out.println("====================================");
            }
        }
    }

    public Livre document(int i){
        return documents[i];
    }

    public boolean ajouter(Livre doc){
        for(int i = 0; i < documents.length; i++){
            if(documents[i] == null){
                documents[i] = doc;
                return true;
            }
        }
        return false;
    }

    public boolean supprimer(Livre doc){
        for(int i = 0; i < documents.length; i++){
            if(documents[i] == doc){
                documents[i] = null;
                return true;
            }
        }
        return false;
    }

    public void afficherAuteurs(){
        for(Livre doc : documents){
            System.out.println(((Livre) doc).getAuteur());
            System.out.println("====================================");
        }
    }
}
