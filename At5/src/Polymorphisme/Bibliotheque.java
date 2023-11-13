package Polymorphisme;

public class Bibliotheque {
    private Document[] documents;

    public Bibliotheque(int capacite) {
        this.documents = new Document[capacite];
    }

    public void afficherDocuments(){
        for(Document doc : documents){
            if(doc != null){
                System.out.println(doc.toString());
                System.out.println("====================================");
            }
        }
    }

    public Document document(int i){
        return documents[i];
    }

    public boolean ajouter(Document doc){
        for(int i = 0; i < documents.length; i++){
            if(documents[i] == null){
                documents[i] = doc;
                return true;
            }
        }
        return false;
    }

    public boolean supprimer(Document doc){
        for(int i = 0; i < documents.length; i++){
            if(documents[i] == doc){
                documents[i] = null;
                return true;
            }
        }
        return false;
    }

    public void afficherAuteurs(){
        for(Document doc : documents){
            if(doc instanceof Livre){
                System.out.println(((Livre) doc).getAuteur());
                System.out.println("====================================");
            }
        }
    }

}
