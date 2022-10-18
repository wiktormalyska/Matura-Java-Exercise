package tablicepc;

import java.util.Scanner;

public class TablicePC {
    
    public static double[][] losowatablica(int kol, int wie){
        Scanner s=new Scanner(System.in);
        //generuje losową tablice o podanych wymiarach
        double [][]t =new double[kol][wie];
        for (int i = 0; i < kol; i++) {
            for (int j = 0; j < 10; j++) {
            t[i][j]=(Math.random());
            }
        }        
        return t;
    }
    public static boolean pokaztablice(double [][]t){
        for (int i = 0; i <t.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(t[j][i]+" ");
            }
            System.out.println("\n");
        }
        return true;
    }
    public static void sumawkolumnie(int kolumna, double [][]t){
        double wynik=0;
        for (int i = 0; i < kolumna; i++) {
            wynik=wynik + t[kolumna][i];
        }
        System.out.println("Suma kolumny: "+kolumna+" wynosi: "+wynik);
    }
    
    /*public static void iloczynwwierszu(int wiersz, double [][]t){
        double wynikw=0;
        for (int i = 0; i < wiersz; i++) {
            wynikw=wynikw * t[i][wiersz];
        }
        System.out.println("Suma wiersza: "+wiersz+" wynosi: "+wynikw);
        
    }*///nie działa nie wiem czemu
    
    public static int liczbawartosciwiekszych(int liczba, double [][]t){
        int wynik=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(liczba<t[i][j]){
                    wynik++;
                }
            }
        }
        return wynik;
    }
    
    public static double sumaprzekatna(double [][]t){
        double suma=0;
        for (int i = t.length; i > 0; i--) {
            suma=suma+t[i][i];
        }
        return suma;
    }
    public static double iloczynprzekatna(double [][]t){
        double suma=0;
        for (int i = t.length; i > 0; i--) {
            suma=suma*t[i][i];
        }
        return suma;
    }
    
    public static double[][] stopni90tabela(double[][]t){
        double [][]t90=new double[t.length][t.length];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                t90[i][j]=t[j][i];
            }
        }
        return t90;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Ile kolumn ma mieć tablica?");
        int kol=s.nextInt();
        System.out.println("Ile wierszy ma mieć tablica?");
        int wie=s.nextInt();
        double [][]tgen = losowatablica(kol, wie);
        pokaztablice(tgen);
        System.out.println("Którą kolumnę sumować?");
        int kolumna = s.nextInt();
        sumawkolumnie(kolumna, tgen);
        //iloczynwwierszu(wie, tgen);
        System.out.println("Jaka liczba ma być sprawdzana czy jest mniejsza od innych liczb w tabeli?");
        int liczba=s.nextInt();
        System.out.println(liczbawartosciwiekszych(liczba, tgen));
        System.out.println("Suma po przekątnej w górę");
        //System.out.println(sumaprzekatna(tgen)); nie działa
        System.out.println("Iloczyn po przekątnej w górę");
        //System.out.println(iloczynprzekatna(tgen)); nie działa
        pokaztablice(stopni90tabela(tgen));
    } //wklejto.pl\893615
    
}
