package zad4;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wprowadź liczbę, a powiem ci czy jest parzysta:");
        int liczba=s.nextInt();
        int p=liczba%2;
        if(p==0){
            System.out.println("Liczba: "+liczba+" jest parzysta");
            
        }else{
            System.out.println("Liczba: "+liczba+" jest nie parzysta");
            
        }
        
    }
    
}
