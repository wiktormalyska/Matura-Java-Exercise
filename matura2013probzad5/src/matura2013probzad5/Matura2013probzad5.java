package matura2013probzad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Matura2013probzad5 {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("C:\\Users\\wikim\\Desktop\\Informatyka\\dane1\\dane.txt");
        List <Integer>lista = odpa(liczbyztablicy("C:\\Users\\wikim\\Desktop\\Informatyka\\dane1\\dane.txt"));
        odpb(lista);
    }
    
    public static boolean czyliczbafibonaciego(int liczba, List <Integer> lista){
        if (lista.contains(liczba)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static List <Integer> zbiorliczbF(){
        List <Integer> s = new ArrayList();
        int rob = 0;
        int a = 0;
        int b = 1;
        s.add(a);
        s.add(b);
        do{            
            rob = a+b;
            s.add(rob);
            a=b;
            b=rob;
        } while (rob<1000000000);
        return s;
    }
    
    public static int [] liczbyztablicy(String sciezka) throws FileNotFoundException{
        Scanner s = new Scanner(new File(sciezka));
        int [] tab = new int[200];
        for (int i = 0; i < 200; i++) {
            tab[i] = s.nextInt();
        }
        return tab;
    }
    
    public static List <Integer> odpa(int [] tab){
        List <Integer> wynik = new ArrayList<>();
        List <Integer> lista = zbiorliczbF();
        for (int i = 0; i < tab.length; i++) {
            if (czyliczbafibonaciego(tab[i], lista)) {
                System.out.println(tab[i]);
                wynik.add(tab[i]);
            }
        }
        return wynik;
    }
    
    public static void odpb(List <Integer> lista){
        int min = lista.get(0);
        int max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (min>lista.get(i)) {
                min = lista.get(i);
            }
            if (max<lista.get(i)) {
                max = lista.get(i);
            }
        }
        System.out.println(max+"\t"+min);
    }
    
    public static void odpc(List <Integer> lista) throws FileNotFoundException{
        int [] liczbyzp = liczbyztablicy("C:\\Users\\wikim\\Desktop\\Informatyka\\dane1\\dane.txt");
        int indeks = 0;
        int dlugoscciagu = 0;
        for (int i = 0; i < 200; i++) {
            if (lista.contains(liczbyzp[i])) {
                lista.indexOf(liczbyzp[i]);
            }
        }
    }
}
