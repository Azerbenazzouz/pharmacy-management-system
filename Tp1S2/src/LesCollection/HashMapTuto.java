package LesCollection;

import java.util.*;

class HashMapTuto {

    public static void main(String args[]) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("c", "10");
        m.put("f", "20");
        m.put("k", "30");
        m.put("x", "40");
        m.put("p", "50");
        m.put("g", "60");
        System.out.println("map initial : " + m);
        // retrouver la valeur associée à la clé "f"
        String ch = m.get("f");
        System.out.println("valeur associée a f : " + ch);
        // ensemble des valeurs (attention, ici Collection, pas Set)
        Collection<String> valeurs = m.values();
        System.out.println("liste des valeurs initiales : " + valeurs);
        valeurs.remove("30");
        // on supprime la valeur "30" par la vue associée 
        System.out.println("liste des valeurs après sup : " + valeurs);
        // ensemble des clés
        Set<String> cles = m.keySet();
        System.out.println("liste des clés initiales :" + cles);
        cles.remove("p");
        // on supprime la clé "p" par la vue associée
        System.out.println("liste des clés après sup : " + cles);
        // modification de la valeur associée à la clé x 
        String old = m.put("x", "25");
        if (old != null) {
            System.out.println("valeur associée a x avant modif : " + old);
        }
        System.out.println("map après modif de x : " + m);
        System.out.println("liste des valeurs après modif de x : " + valeurs);
        // On parcourt les entrées (Map.Entry) du map jusqu’a trouver la valeur 20
        // et on supprime l’élément correspondant (suppose exister) 
        Set<Map.Entry<String, String>> entrees = m.entrySet();
        Iterator<Map.Entry<String, String>> iter = entrees.iterator();
        
        Iterator<Map.Entry<String, String>> iter2 = m.entrySet().iterator();
        
        while (iter.hasNext()) {
            Map.Entry<String, String> entree = iter.next();
            String valeur = entree.getValue();
            if (valeur.equals("20")) {
                System.out.println("valeur 20 " + "trouvée en clé "
                        + entree.getKey());
                iter.remove(); // suppression sur la vue associée
                break;
            }
        }
        System.out.println("map après sup élément dont la valeur est 20 :" + m);
        // on supprime l’élément de clé "f"
        m.remove("f");
        System.out.println("map après suppression f : " + m);
        System.out.println("liste des clés après suppression f : " + cles);
        System.out.println("liste des valeurs après supp de f : " + valeurs);
    }
}
