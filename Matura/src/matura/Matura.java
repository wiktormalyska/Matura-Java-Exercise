package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Matura {

    public static String[] wczytaj(String sciezka) throws FileNotFoundException{
        File plik=new File(sciezka);
        Scanner s=new Scanner(plik);
        String []tdane=new String[1000];
        for(int i=0; i<tdane.length; i++){
            tdane[i]=s.next();
        }
        return tdane;
    }
    
    public static void pokaz(String []t){
        for (int i = 0; i <t.length; i++) {
            System.out.println((i+1)+". "+t[i]);
        }
    }
    
    public static int parzysta(String []t){
        int licznik =0;
        for (int i = 0; i <t.length; i++) {
            if(t[i].endsWith("0")) licznik++;
        }
        return licznik;
    }

    public static long BinToLong10(String napis){
        return Long.parseLong(napis, 2);
    }
    public static String Long10ToBin(long liczba){
        return Long.toBinaryString(liczba);
    }
    
    public static long najwieksza(String []t) {
        long max=BinToLong10(t[0]);
        for (int i = 1; i <t.length; i++) {
            long nastepna=BinToLong10(t[i]);
            if(max<=nastepna) max=nastepna;
        }
        return max;
    }
    public static int ilejesttychliczbodl9(String []t) {
        int licznik =0;
        for (int i = 0; i < t.length; i++) {
            if(t[i].length()==9) licznik++;
        }
        return licznik;
    }
    
    public static String sumaliczbodl9(String []t){
        long[]liczby10=new long[ilejesttychliczbodl9(t)];
        int index=0;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        for (int i = 0; i < t.length; i++) {
            if(t[i].length()==9){
                liczby10[index]=BinToLong10(t[i]);
                index++;
            }
        }
        long suma=0;
        for(int i=0; i<liczby10.length; i++){
            suma=suma+liczby10[i];
        }
        return "Suma liczb dł. 9 w pliku w systemie 10-tnym: "+suma+""
                + ", czyli w systemie binarnym to "+Long10ToBin(suma);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String []tdane=wczytaj("C:/Users/Wiktor/Desktop/liczby.txt");//new String[1000];
        pokaz(tdane);
        System.out.println("Odp A)"+parzysta(tdane));
        System.out.println("Odp B) Największa w pliku liczba w systemie 10: "
                + ""+najwieksza(tdane)+"\tTa liczba w systemie binarnym to: "
                + ""+Long10ToBin(najwieksza(tdane)));
        System.out.println("Odp C) Jest: "+ilejesttychliczbodl9(tdane)+" liczb o długości 9"+sumaliczbodl9(tdane));
    }
    
}