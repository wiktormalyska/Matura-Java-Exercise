package zad7;

import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wpisz liczbę, a powiem ci czy jest większa od drugiej liczby: ");
        int aa=s.nextInt();
        System.out.print("Wpisz drugą liczbę: ");
        int bb=s.nextInt();
        if(aa>bb){
            System.out.println(aa);
        
        }else {
            System.out.println(bb);
            
        }
        
    }
    
}
