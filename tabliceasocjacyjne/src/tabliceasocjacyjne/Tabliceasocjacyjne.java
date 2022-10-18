package tabliceasocjacyjne;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Tabliceasocjacyjne {


    public static void main(String[] args) {
        Map<String, String> m = new TreeMap<>();
        m.put("słodki", "Brzoskwinia");
        m.put("Kwaśne", "Cytryna");
        m.put("Gorzki", "Oregano"); System.out.println(m.toString());
        m.remove("Gorzki"); System.out.println(m.toString());
        Wyswietl(m);
        System.out.println(pokaz(m, "Kwaśne"));
        System.out.println(smak(m, "Cytryna"));
    }
    
    public static void Wyswietl(Map <String, String> m){
        for (Map.Entry<String, String> entry : m.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value+" ma smak: "+key);
        }
    
    }
    
    public static String pokaz(Map <String, String> m, String klucz){
        return m.get(klucz);
    }
    
    public static String smak(Map <String, String> m, String nazwa) {
        String odp = "";
        for (Map.Entry<String, String> entry : m.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (nazwa.equals(value)){
                return key;
            }
            
        }
        return odp;
    }
}
