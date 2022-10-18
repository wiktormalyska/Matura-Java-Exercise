package matura2020probnazad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Matura2020probnaZad4 {

    public static void main(String[] args) throws FileNotFoundException {
//        Map<Integer, Integer> m = new TreeMap<>();
//        int t[] = czytajzpliku("C:\\dane4.txt");
//        pokaztab(t);
//        int tnl[] = tablicaluk(t);
//        pokaztab(tnl);
//        System.out.println("\n4.1");
//        System.out.println(najmniejszaluka(tnl));
//        System.out.println(najwiekszaluka(tnl));
//        System.out.println(najczestrzaluka(tnl, t, m));
//        Set<Integer> zk = tworzzbiorkrotnosci(tnl);
//        Map<Integer, Integer> map = ustaw0wwartmapy(zk);
//        Wyswietlmape(map);
//        Wyswietlmape(krotnosc(map, tnl));
//        System.out.println(najczestrzaluka(map));
//        najczestrzaliczba(map, najczestrzaluka(map));
//        System.out.println();
    int t[] = czytajzpliku("C:\\dane4.txt");
    
    Map<Integer, ArrayList<ArrayList<Integer>>> fr = fragmentyregulatne(t);
        System.out.println(fr.toString());
        System.out.println("Najdłuższy fragment ma długość: "+dlugoscnajdluzszegofragmentu(fr));
        System.out.println(wyswietlmape(fr));
        System.out.println("---------------------");
        System.out.println(najdluzszyfragmentregularny(fr, 17));
        pierwszaiostatnia(najdluzszyfragmentregularny(fr, 17));
    }
    
    public static void pierwszaiostatnia (ArrayList<Integer> lista){
        System.out.println(lista.get(0)+"\t"+lista.get(lista.size()-1));
    }
    
    public static String wyswietlliste(ArrayList<Integer> lista){
        String napis = "[";
        for (Integer liczba : lista) {
            napis += liczba+", ";
        }
        napis += "]";
        return napis;
    }
    
    public static String wyswietllistelist(ArrayList<ArrayList<Integer>> listalist){
        String napis = "";
        for (ArrayList<Integer> lista : listalist) {
            napis += wyswietlliste(lista)+", ";
        }
        return napis;
    }
    
    public static String wyswietlmape (Map<Integer, ArrayList<ArrayList<Integer>>> fr){
        String napis = "";
        for (Map.Entry<Integer, ArrayList<ArrayList<Integer>>> entry : fr.entrySet()) {
            Integer luka = entry.getKey();
            ArrayList<ArrayList<Integer>> listalist = entry.getValue();
            napis += luka+"-> "+wyswietllistelist(listalist)+"\n";
            
        }
        return napis;
    }
    
    public static ArrayList<Integer> najdluzszyfragmentregularny(Map<Integer, ArrayList<ArrayList<Integer>>> fr, int dlugosc){
        for (Map.Entry<Integer, ArrayList<ArrayList<Integer>>> entry : fr.entrySet()) {
            Integer luka = entry.getKey();
            ArrayList<ArrayList<Integer>> listalist = entry.getValue();
            for (ArrayList<Integer> lista : listalist) {
                if (dlugosc == lista.size()) {
                    return lista;
                }
            }
        }
        return null;
    } 
    
    public static int dlugosclisty(ArrayList<Integer> al){
        return al.size();
    }
    
    public static int dlugosclistylist(ArrayList<ArrayList<Integer>> listalist){
        int dlugosc=-1;
        for (ArrayList<Integer> lista : listalist) {
            if (dlugosc<dlugosclisty(lista)) {
                dlugosc = dlugosclisty(lista);
            }
        }
        return dlugosc;
        
    }
    
    public static int dlugoscnajdluzszegofragmentu(Map<Integer, ArrayList<ArrayList<Integer>>> fr){
        int dlugosc = -1;
        for (Map.Entry<Integer, ArrayList<ArrayList<Integer>>> entry : fr.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<ArrayList<Integer>> listalist = entry.getValue();
            if (dlugosc<dlugosclistylist(listalist)) {
                dlugosc=dlugosclistylist(listalist);
            }
        }
        return dlugosc;
    }
    
    public static int luka(int a, int b){
        return Math.abs(a-b);
    }
    
    public static int[] tablicaluk(int[]t){
        int tnl[] = new int[t.length-1];
        int j = 0;
        for (int i = 0; i < t.length-1; i++) {
            tnl[j]=luka(t[i], t[i+1]);
            j++;
        }
        return tnl;
    }
    
    public static void pokaztab(int[]t){
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+", ");
        }
        System.out.print("\n");
    }
    
    public static int najmniejszaluka(int[]t){
        int wynik = t[0];
        for (int i = 1; i < t.length; i++) {
            if (wynik<t[i]) {
                wynik=t[i];
            }
        }
        return wynik;
    }
    
    public static int najwiekszaluka(int[]t){
        int wynik = t[0];

        for (int i = 1; i < t.length; i++) {
            if (wynik>t[i]) {
                wynik=t[i];
            }
        }
        return wynik;
    }
    
    public static int[] czytajzpliku(String sciezka) throws FileNotFoundException{
        File plik = new File(sciezka);
        Scanner s = new Scanner(plik);
        int []t = new int[1000];
        for (int i = 0; i < t.length; i++) {
            t[i] = s.nextInt();
        }
        return t;
    }
    
    public static int najczestrzaluka(int []tluki, int []tliczby, Map<Integer, Integer> m) {
        int odp = 0;
        for (int i = 0; i < tluki.length; i++) {
            m.put(i, tluki[i]);
        }
        Wyswietlmape(m);
        int aktualnaliczba = m.get(0);
        int aktualnewystapienia = 0;
        int najczestrzewystapienie = 0;
        int najczestrzaliczba = 0;
        for (int i = 1; i < m.size(); i++) {
            if (m.get(i-1)== m.get(i)) {
                aktualnaliczba=m.get(i);
                aktualnewystapienia++;
            } else{
                if (aktualnewystapienia >= najczestrzewystapienie) {
                    najczestrzewystapienie=aktualnewystapienia;
                    
                    najczestrzaliczba=aktualnaliczba;
                } else {
                    aktualnewystapienia=0;
                }
                
            }
        }
        
        System.out.println("\nluka "+najczestrzewystapienie);
        for (int i = 0; i < tliczby.length-1; i++) {
            if (tluki[i]==najczestrzewystapienie) {
                System.out.println(tliczby[i]+"\t"+tliczby[i+1]);
            } else System.out.println("nie ma");
        }
        System.out.println("\n4.3\n"+""+najczestrzaliczba);
        return najczestrzewystapienie;
    }
    
    public static Set<Integer> tworzzbiorkrotnosci(int tluki[]){
        Set<Integer> odp = new TreeSet<Integer>();
        for (int i = 0; i < tluki.length; i++) {
            odp.add(tluki[i]);
        }
        return odp;
    }
    
    public static Map<Integer, Integer> ustaw0wwartmapy(Set<Integer> zbiorkluczy){
        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for (Integer klucz : zbiorkluczy) {
            m.put(klucz, 0);
        }
        return m;
    }
    
    public static Map<Integer, Integer> krotnosc(Map<Integer,Integer> m,int t[]){
        for (int i = 0; i < t.length; i++) {
            int wartosckrotnosci = m.get(t[i]);
            m.replace(t[i], wartosckrotnosci+1);
        }
        return m;
    }
    
    public static int najczestrzaluka(Map<Integer, Integer>m){
        int w=0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            Integer value = entry.getValue();
            if (value>w) {
                w=value;
            }
            
        }
        return w;
    }
    
    public static void najczestrzaliczba(Map<Integer, Integer>m, int wartoscluki){
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (wartoscluki==value) {
                System.out.println("Luka o najczęstszej wartości to: "+key);
            }
        }
    }
    
    public static void Wyswietlmape(Map <Integer, Integer> m){
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"\t"+value);
        }
    
    }
    
    public static Map<Integer, ArrayList<ArrayList<Integer>>> fragmentyregulatne(int t[]){
        int tluk[] = tablicaluk(t);
        Set<Integer> zbiorluk = tworzzbiorkrotnosci(tluk);
        Map<Integer, ArrayList<ArrayList<Integer>>> fr = new TreeMap<>();
        for (Integer dlugosc : zbiorluk) {
            ArrayList<ArrayList<Integer>> listaGlowna=new ArrayList<>();
            ArrayList<Integer> listaPodrzedna=  new ArrayList<>();
            boolean start = true;
            for (int i = 0; i < t.length-1; i++) { 
                if (dlugosc == luka(t[i], t[i+1]) && start==true) {
                    listaPodrzedna.add(t[i]);
                    listaPodrzedna.add(t[i+1]);
                    start = false;
                } else if(dlugosc == luka(t[i], t[i+1])&& start==false){
                    listaPodrzedna.add(t[i+1]);
                }   else {
                    if (!listaPodrzedna.isEmpty()) {
                        listaGlowna.add(listaPodrzedna);
                        listaPodrzedna= new ArrayList<>();
                        start = true;
                    } else {
                        start = true;
                    }
                }
                
            }
            
            fr.put(dlugosc, listaGlowna);
        }
        
        return fr;
    }
    
}
