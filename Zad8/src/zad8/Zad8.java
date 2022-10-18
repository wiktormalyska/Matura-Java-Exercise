package zad8;

import java.util.Scanner;

public class Zad8 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wprowadź pierwszą z trzech liczb, a powiem ci która jest największa: ");
        int a=s.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int b=s.nextInt();
        System.out.print("Wprowadź trzecią liczbę: ");
        int c=s.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            } else{
                System.out.println(c);
                
            }
        }else{
            if(b>c){
                System.out.println(b);
            } else{
                System.out.println(c);
                
            }
            
        }
        
    }
    
}
