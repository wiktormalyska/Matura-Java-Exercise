package zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6 {

    public static String[] wczytajZPliku(String sciezka) throws FileNotFoundException {
        String[] t = new String[5000];
        File plik = new File(sciezka);
        Scanner s = new Scanner(plik);
        for (int i = 0; i < t.length; i++) {
            t[i] = s.next();
        }
        return t;
    }

    public static void pokaz(String[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }

    public static int odpA(String[] t) {
        int licznik = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i].charAt(0) == t[i].charAt(t[i].length() - 1)) {
                licznik++;
            }
        }
        return licznik;
    }

    public static long OctToLong(String napis) {
        return Long.parseLong(napis, 8);
    }

    public static String LongToString(long liczba) {
        return Long.toString(liczba);
    }

    public static int odpB(String[] t) {
        int licznik = 0;
        for (int i = 0; i < t.length; i++) {
            long liczba = OctToLong(t[i]);
            String napis = LongToString(liczba);
            if (napis.charAt(0) == napis.charAt(napis.length() - 1)) {
                licznik++;
            }
        }
        return licznik;
    }

    public static boolean badaj(String napis) {
        boolean wynik = true;
        for (int i = 0; i < napis.length() - 1; i++) {
            char literaP = napis.charAt(i);
            char literaN = napis.charAt(i + 1);
            int kodP = (int) literaP;
            int kodN = (int) literaN;
            if (kodP <= kodN) {
                wynik = wynik & true;
            } else {
                return false;
            }
        }
        return wynik;
    }

    public static int liczbaDobrychDoC(String[] t) {
        int licznik = 0;
        for (int i = 0; i < t.length; i++) {
            if (badaj(t[i])) {
                licznik++;
            }
        }
        return licznik;
    }
    
    public static void drugapolowaodpc(String []t){
        long []liczbyL=new long[liczbaDobrychDoC(t)];
        int index=0;
        for (int i = 0; i <t.length; i++) {
            if(badaj(t[i])){
                liczbyL[index]=OctToLong(t[i]);
                index++;
            }
        }
        long max=liczbyL[0];
        for (int i = 1; i < liczbyL.length; i++) {
            if (max<liczbyL[i]) {
                max=liczbyL[i];
            }
        }
        System.out.println("Max w 10 wynosi: "+max+" ,zas w 8 wynosi: "+Long.toOctalString(max));
        
        long min=liczbyL[0];
        for (int i = 0; i < liczbyL.length; i++) {
            if (min>liczbyL[i]) {
                min=liczbyL[i];
            }
        }
        System.out.println("Min w 10 wynosi: "+min+" ,zas w 8 wynosi: "+Long.toOctalString(min));
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] tliczb = wczytajZPliku("C:\\Users\\Wiktor\\Desktop\\Dane_PR\\dane.txt");
        pokaz(tliczb);
        System.out.println("Odp.A)" + odpA(tliczb));
        System.out.println("60 w 8 = " + OctToLong("60"));
        System.out.println("Odp.B)" + odpB(tliczb));
        System.out.println("Odp.C)");
        System.out.println("Wszystkich liczb semkowych o wasnosci c) jest "+liczbaDobrychDoC(tliczb));
        drugapolowaodpc(tliczb);
    }

}
