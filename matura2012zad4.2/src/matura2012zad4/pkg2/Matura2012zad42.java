package matura2012zad4.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matura2012zad42 {

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(szyfruj("LATO", "WODA"));
//        System.out.println(szyfruj("MARTA", "TOR"));
//        System.out.println(deszyfruj("GPJNP", "TOR"));
          System.out.println(zaszyfrowanezplik("C:\\Users\\wikim\\Desktop\\Informatyka\\tj.txt", "C:\\Users\\wikim\\Desktop\\Informatyka\\klucze1.txt"));
          System.out.println("\n\n\n\n"+deszyfrowanezplik("C:\\Users\\wikim\\Desktop\\Informatyka\\sz.txt", "C:\\Users\\wikim\\Desktop\\Informatyka\\klucze2.txt"));
    }
    
    public static String szyfruj(String tekst, String klucz){
        String wynik="";
        for (int i = 0; i < tekst.length(); i++) {
            int kod = (int)tekst.charAt(i);
            int nrlitery = (int)klucz.charAt(i%klucz.length())-64;
            int suma = kod+nrlitery;
            if (suma>90) {
                suma-=26;
            }
            char znak = (char)suma;
            wynik += znak;
        }
        return wynik;
    }
    
    public static String deszyfruj(String zaszyfrowane, String klucz){
        String wynik = "";
        for (int i = 0; i < zaszyfrowane.length(); i++) {
            int kod = (int)zaszyfrowane.charAt(i);
            int nrlitery = (int)klucz.charAt(i%klucz.length())-64;
            int suma = kod-nrlitery;
            if (suma<65) {
                suma+=26;
            }
            wynik+=(char)suma;
        }
        return wynik;
    }
    
    public static String zaszyfrowanezplik(String sciezkatj, String sciezkaklucz) throws FileNotFoundException{
        Scanner stj = new Scanner(new File(sciezkatj));
        Scanner sklucz = new Scanner(new File(sciezkaklucz));
        String wynik = "";
        for (int i = 0; i < 120; i++) {
            wynik= wynik+szyfruj(stj.next(),sklucz.next())+"\n";
            
        }
        return wynik;
    }
    
        public static String deszyfrowanezplik(String sciezkatj, String sciezkaklucz) throws FileNotFoundException{
        Scanner stj = new Scanner(new File(sciezkatj));
        Scanner sklucz = new Scanner(new File(sciezkaklucz));
        String wynik = "";
        for (int i = 0; i < 120; i++) {
            wynik= wynik+deszyfruj(stj.next(),sklucz.next())+"\n";
            
        }
        return wynik;
        }
}
