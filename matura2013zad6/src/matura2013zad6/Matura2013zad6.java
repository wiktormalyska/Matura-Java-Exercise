/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matura2013zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author wikim
 */
public class Matura2013zad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String [] tab = czytajzpliku("C:\\Users\\wikim\\Desktop\\Informatyka\\PR_dane\\dane.txt");
        System.out.println(odpa(tab));
        System.out.println(osemkana10("2000000"));
        System.out.println(odpb(tab));
    }
    
    public static boolean czy1rowneostatnie(String napis){
        return (napis.charAt(0)==napis.charAt(napis.length()-1))? true: false;
    }
    
    public static String [] czytajzpliku(String sciezka) throws FileNotFoundException{
        Scanner s = new Scanner(new File(sciezka));
        String [] wynik = new String[5000];
        for (int i = 0; i < wynik.length; i++) {
            wynik[i]=s.nextLine();
        }
        return wynik;
    }
    
    public static int odpa(String [] tab){
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (czy1rowneostatnie(tab[i])) {
                wynik++;
            }
            
        }
        return wynik;
    }
    
    public static long osemkana10(String liczba){
        long wynik =Long.parseLong(liczba, 8);
        return wynik;
    }
    
    public static int odpb(String []tab){
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (czy1rowneostatnie(String.valueOf(osemkana10(tab[i])))) {
                wynik++;
            }
            
        }
        return wynik;
    }
}
