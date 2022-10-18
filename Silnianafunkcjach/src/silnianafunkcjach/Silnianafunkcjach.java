package silnianafunkcjach;

import java.util.Scanner;

public class Silnianafunkcjach {

    public static void pokaz(int i,long wynik){
        System.out.println(i+"! = "+wynik);
    }
    
    public static long silnia(int n){
        long wynik=1;
        for(int i=1; i<=n; i++){
            wynik=wynik*i;
        }
        return wynik;
    }
    
    public static void main(String[] args) {
        System.out.println(machina());
        int n=wczytaj("Ustal n: ");
        long wynik=silnia(n);
        pokaz(n, wynik);
        int start=wczytaj("poczatkowa=");
        int ile=wczytaj("ile liczb chcesz zobaczyc: ");
        pokazco4(start, ile);
    }
    public static void pokazco4(int poczatek, int ile){
        for (int i = 0; i <ile; i++) {
            System.out.print(poczatek+", ");
            poczatek=poczatek+4;
        }
        
    }
    
    public static int wczytaj(String wyraz){
        Scanner skaner=new Scanner(System.in);
        System.out.println(wyraz);
        int n=skaner.nextInt();
        return n;
    }
    
    
    public static String machina(){
        String wynik="";
        for (int i = 0; i < 1000; i++) {
            if(i % 17 == 12){
                wynik=wynik+"\n"+i;
            }
        }
        return wynik;
    }
}
