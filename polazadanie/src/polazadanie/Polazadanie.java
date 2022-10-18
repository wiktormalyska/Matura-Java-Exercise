/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polazadanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author wikim
 */
public class Polazadanie {

    public static double Wyznacznik(Wektor U, Wektor V){
	return U.getX()*V.getY()-U.getY()*V.getX();
}
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(Pole(new Punkt(1.0,0.0), new Punkt(1.0,1.0), new Punkt(0.0,1.0)));
        Pokaz(czytaj("C:\\Users\\wikim\\Downloads\\liczby.txt"));
        Pola(czytaj("C:\\Users\\wikim\\Downloads\\liczby.txt"));
}
    public static double is(Wektor A, Wektor B){
        return A.getX()*B.getX()+A.getY()*B.getY()+A.getZ()*B.getZ();
    }
    public static double cosinus(Wektor A, Wektor B){
        return is(A, B)/(A.dlugosc()*B.dlugosc());
    }
    public static double sinus(Wektor A, Wektor B){
        return Math.sqrt(1-cosinus(A, B)*cosinus(A, B));
    }
    
    public static double Pole(Punkt A, Punkt B, Punkt C){
	Wektor AB = new Wektor(A, B);
	Wektor AC = new Wektor(A, C);
        return 0.5*AB.dlugosc()*AC.dlugosc()*sinus(AC, AB);
//	return 0.5*Math.abs(Wyznacznik(AB, AC));
    }
    
    public static void Pola(Punkt[][]tablica){
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("P"+(i+1)+"="+Pole(tablica[i][0], tablica[i][1], tablica[i][2]));
        }
    }
    
    public static Punkt[][] czytaj(String sciezka) throws FileNotFoundException{
        Scanner s = new Scanner(new File(sciezka));
        Punkt[][] dane = new Punkt[800][3];
        for (int i = 0; i < dane.length; i++) {
            for(int h=0; h<3; h++)
                 dane[i][h]=new Punkt(s.nextDouble(), s.nextDouble(), s.nextDouble());
        }
        return dane;
    }
    
    public static void Pokaz(Punkt dane[][]){
        for (int i = 0; i < dane.length; i++) {
            for(int h=0; h<3; h++){
                System.out.print(dane[i][h]+"\t");
               
            }
            System.out.println("");
        }
        
    }
    
}
