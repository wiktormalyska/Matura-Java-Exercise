package zad9;

import java.util.Scanner;

public class Zad9 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wprowadź pierwszą z dwóch, a podam ci je w kolejności rosnącej: ");
        int a=s.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int b=s.nextInt();
        if(a>b){
            System.out.println(b+a);
            
        } else{
            System.out.println(a+""+b);
            
        }
        
    }
    
}
