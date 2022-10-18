package binarnezad.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarneZad4 {
    
    public static int [] wczytajtablica(String plik) throws FileNotFoundException{
        File liczby=new File(plik);
        Scanner s=new Scanner(liczby);
        int []t= new int[1000];
        for (int i = 0; i < t.length; i++) {
            t[i]=s.nextInt();
        }
        return t;
    }
    
    public static void pokaztablica(int [] t) throws FileNotFoundException{
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]+"\t");
        }
    }
    
    public static boolean czyjestwiecej0niz1(int liczba){
        int ilosc0=0;
        int ilosc1=0;
        int dlugosc=String.valueOf(liczba).length();
        for (int i = 0; i < dlugosc; i++) {
            if (String.valueOf(liczba).charAt(dlugosc)==0) {
                ilosc0++;
            } else {
                ilosc1++;
            }
        }
        if (ilosc0>ilosc1) {
            return true;
        }
        return false;
    }
    
    public static int Zad4_1(int []t){
        int liczba=0;
        for (int i = 0; i < t.length; i++) {
            if (czyjestwiecej0niz1(t[i])) {
                liczba++;
            }
        }
        return liczba;
    }
    
    public static boolean czyliczbapoczielnaprzez2(int wyraz){
        int liczba=wyraz;
        if (liczba%2==0) {
            return true;
        }
        return false;
    }
    
    public static boolean czyliczbapoczielnaprzez8(int wyraz){
        int liczba=wyraz;
        if (liczba%8==0) {
            return true;
        }
        return false;
    }
    
    public static void Zad4_2(int [] t){
        int liczbypodzielneprzez2=0;
        int liczbypodzielneprzez8=0;
        for (int i = 0; i < t.length; i++) {
            if (czyjestwiecej0niz1(t[i])) {
            liczbypodzielneprzez2++;
                }   
            if (czyliczbapoczielnaprzez8(t[i])) {
                liczbypodzielneprzez8++;
            }
        }
        System.out.println("Liczb podzielnych przez 2 jest: "+liczbypodzielneprzez2);
        System.out.println("Liczb podzielnych przez 8 jest: "+liczbypodzielneprzez8);
    }
    
    public static int wiersznajmniejszejliczby(int [] t){
        int wiersz=0;
        int liczba=t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i]<=liczba) {
                liczba=t[i];
                wiersz=i;
            }
        }
        return wiersz;
    }
    
    public static int wiersznajwiekszejliczby(int[] t){
        int wiersz=0;
        int liczba=t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i]>=liczba) {
                liczba=t[i];
                wiersz=i;
            }
        }
        return wiersz;
    }
    
    public static void Zad4_3(String plik) throws FileNotFoundException{
        
        System.out.println("Wiersz najmniejszej liczby: "+wiersznajmniejszejliczby(wczytajtablica(plik)));
        System.out.println("Wiersz największej liczby: "+wiersznajwiekszejliczby(wczytajtablica(plik)));
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        int [] t=new int [1000];
        String plik = "C:\\Users\\wikim\\Desktop\\Dane_PR2\\liczby.txt";
        pokaztablica(wczytajtablica(plik));
        System.out.println(Zad4_1(wczytajtablica(plik)));
        Zad4_2(wczytajtablica(plik));
        Zad4_3(plik);
    }
    
}
