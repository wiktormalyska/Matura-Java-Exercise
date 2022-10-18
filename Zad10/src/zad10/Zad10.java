package zad10;

import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wprowadź pierwszą z trzech liczb, a ułoże je malejąco: ");
        int a=s.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int b=s.nextInt();
        System.out.println("Wprowadź trzecią liczbę: ");
        int c=s.nextInt();
        
        if(a>b){
            if(b>c){
                System.out.println(a+""+b+""+c);
            } else{
                if(a>c){
                System.out.println(a+""+c+""+b);
                } else{
                System.out.println(c+""+a+""+b);
                }
            }
        } else{
            if(a>c){
                System.out.println(b+""+a+""+c);
            } else {
                if(c>b){
                    System.out.println(c+""+b+""+a);
                }else{
                    System.out.println(b+""+c+""+a);
                }
            }
            
        }
        
    }
    
}
