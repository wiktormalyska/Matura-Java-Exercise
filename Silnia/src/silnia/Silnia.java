package silnia;

import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Program liczy n!");
        System.out.print("Ustal n=");
        int n=s.nextInt();
        
        long wynik=1;
        for(int i=1; i<=n; i++){
            wynik=wynik*i;
        }
        System.out.println(n+"!="+wynik);
    }
    
}
