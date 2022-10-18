package matmahorner;

import java.util.Scanner;

public class MatmaHorner {

    public static double [] wartoscWiel(double []a, double x){
        double [] suma =new double[a.length];
        suma[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            suma[i]=a[i]*x;
        }
        return suma;
    }
    
    public static void pokaz(double []t){
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+"   ");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Wpisz ile ma być cyfr: ");
        int liczba=s.nextInt();
        double []a=new double[liczba];
        for (int i = 1; i < liczba+1; i++) {
            System.out.print("Wpisz "+i+" liczbę: \n");
            a[i-1]=s.nextDouble();
        }
        System.out.print("\n\nWpisz wartość x w: W(x): ");
        double x=s.nextDouble();
        pokaz(wartoscWiel(a, x));

    }
    
}
