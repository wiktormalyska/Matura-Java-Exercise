package zad5;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wpisz liczbę, a powiem ci czy jest podzielna przez drugą liczbę: ");
        int aa=s.nextInt();
        System.out.print("Wpisz drugą liczbę: ");
        int bb=s.nextInt();
        int p=aa%bb;
        if(p==0){
            System.out.println("Liczba: "+aa+" jest podzielna przez liczbę: "+bb);
            
        }else {
            System.out.println("Liczba: "+aa+" nie jest podzielna przez liczbę: "+bb);
            
        }
    }
    
}
