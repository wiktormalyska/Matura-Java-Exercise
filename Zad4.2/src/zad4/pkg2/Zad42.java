package zad4.pkg2;

import java.util.Scanner;

public class Zad42 {

    public static int oszczednosc(int dni, int kwota){
    int zaoszcz=dni*kwota;
    return zaoszcz;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Podaj ilość dni przez jaką oszczędzał: ");
        int dni=s.nextInt();
        System.out.println("Podaj kwotę oszczędzaną: ");
        int kwota=s.nextInt();
        System.out.println(oszczednosc(dni, kwota));
    }
    
}
