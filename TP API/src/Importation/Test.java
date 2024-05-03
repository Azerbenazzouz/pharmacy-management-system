package Importation;

public class Test {
    public static void main(String args[]){
        FichierEtudient f = new FichierEtudient("etud.txt", "d:/");
        System.out.println(f.importer());
    }
}
