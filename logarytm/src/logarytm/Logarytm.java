package logarytm;

import java.util.Scanner;

public class Logarytm {

    public static double wczytaj(String komunikat){
        System.out.println(komunikat);
        Scanner s=new Scanner(System.in);
        double x=s.nextDouble();
        return x;
    }
    
    public static double maszynaLicząca(double a, double b){
        return Math.log10(b)/Math.log10(a);
    }
    
    public static void main(String[] args) {
        double a=wczytaj("Ustal podstawę logarytmu a= ");
        double b=wczytaj("Zadaj liczbę logartymowaną b= ");
        if(a>0 && a!=1 && b>0){
            System.out.println("log("+a+"){"+b+"} = "+maszynaLicząca(a, b));
        } else {
            System.out.println("log("+a+"){"+b+"} - Taki logarytm nie istnieje!");
        }
    }
    
}
