package wesola2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Wesola2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(czywesola(89));
        long t [] = czytajzpliku("C:\\Users\\wikim\\Desktop\\maturainformatyka2021probnaoperon\\liczby.txt");
//        pokaztabele(t);
        System.out.println(rozwiazanie42(t));
//        System.out.println(czypierwsza(9));
        System.out.println(rozwiazanie43(t));
        System.out.println(budujmape(t));
        rozwiazanie41(t);
        
    }
    
    public static long Suma(long liczba){
        long s = 0;
        while (liczba>0) {            
            s=s+(liczba%10)*(liczba%10);
            liczba=liczba/10;
        }
        return s;
    }
    
    public static boolean czywesola(long liczba){
        ArrayList <Long> lista = new ArrayList<>();
        
        while (liczba !=1) {            
            lista.add(liczba);
            liczba = Suma(liczba);
            if (lista.contains(liczba)) {
                return false;
            }
            
        }
        return true;
    }
    
    public static long[] czytajzpliku(String sciezka) throws FileNotFoundException{
        File file = new File(sciezka);
        Scanner s = new Scanner(file);
        long t [] = new long[2001];
        for (int i = 0; i < t.length; i++) {
            t[i] = s.nextLong();
        }
        return t;
    }
    
    public static void pokaztabele(long t[]){
        int licznik=1;
        for (long l : t) {
            System.out.println(licznik+"\t"+l);
            licznik++;
        }
    }
    
    public static int rozwiazanie42(long t[]){
        int wynik=0;
        for (long l : t) {
            if (czywesola(l)) {
                wynik++;
            }
        }
        return wynik;
    }
    
    public static boolean czypierwsza(long liczba){
        if (liczba ==0 || liczba ==1) {
            return false;
        }
        for (int i = 2; i < liczba; i++) {
            if (liczba%i==0) {
                return false;
            }
        }
        return true;
    }
    
        public static int rozwiazanie43(long t[]){
        int wynik=0;
        for (long l : t) {
            if (czywesola(l) && czypierwsza(l)) {
                wynik++;
            }
        }
        return wynik;
    }
        public static Set<Long> wesoledozbioru(long t []){
            Set<Long> zbior = new TreeSet<>();
            for (int i = 0; i < t.length; i++) {
                if (czywesola(t[i])) {
                    zbior.add(t[i]);
                }
            }
            return zbior;
        }
        
        public static ArrayList<Long> cykl(long liczba){
             ArrayList <Long> lista = new ArrayList<>();
        long rob = liczba;
        while (liczba !=1) {            
            lista.add(liczba);
            liczba = Suma(liczba);
        }
            if (czywesola(rob)) {
                lista.add((long)1);
            }
            return lista;
        }
        
        public static Map<Long, ArrayList<Long>> budujmape(long t[]){
            Map<Long, ArrayList<Long>> mapa = new TreeMap<>();
            Set<Long> zbior = wesoledozbioru(t);
            for (Long wesola : zbior) {
                mapa.put(wesola, cykl(wesola));
            }
            return mapa;
        }
        
        public static void rozwiazanie41(long t[]){
            Map<Long, ArrayList<Long>> mapa = budujmape(t);
         long najwieksza=0;
         long dlugosccyklu=0;
            for (Map.Entry<Long, ArrayList<Long>> entry : mapa.entrySet()) {
                Long wesole = entry.getKey();
                ArrayList<Long> lista = entry.getValue();
                if (lista.size()>najwieksza) {
                    najwieksza=wesole;
                    dlugosccyklu=lista.size();
                }
                
            }
            System.out.println("Najwiekszy cykl w liczbie: "+najwieksza);
            System.out.println("Długość cykli: "+dlugosccyklu);
            System.out.println("Liczby w cyklu dla wesołej: "+cykl(najwieksza));
        }
}
