  package tablica;

import java.util.Arrays;
import java.util.Scanner;

public class Tablica {
    
    public static double [] zapamietaj(int ile){
        double [] t=new double[ile];
        Scanner s=new Scanner(System.in);
        for(int i=0; i<ile; i++){
            System.out.print("Zadaj liczbę nr "+(i+1)+": ");
            t[i]=s.nextDouble();
        }
        return t;
    }
    
    public static void pokaz(double []t){
        System.out.println("");
        for (int i = 0; i <t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void main(String[] args) { 
        double []t=zapamietaj(3);
        Arrays.sort(t);
        pokaz(t);

    }
    
}
