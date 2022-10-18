
package sylwester;

import java.util.Scanner;


public class Sylwester {

public static void main(String[] args) {
        System.out.println("Zadaj dzień i miesiąc liczbowo a powiem Ci ile dni do Sylwka");
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Zadaj dzień:");
        int dzien=s.nextInt();
        System.out.print("Zadaj miesiąc: ");
        int mc=s.nextInt();
        
        int suma=0;
        switch(mc){
            case 1: suma=suma+31;
            case 2: suma=suma+28;
            case 3: suma=suma+31;
            case 4: suma=suma+30;
            case 5: suma=suma+31;
            case 6: suma+=31;
            case 7: suma+=31;
            case 8: suma+=31;
            case 9: suma+=30;
            case 10: suma+=31;
            case 11: suma+=30;
            case 12: suma+=31;    
        }
        System.out.println("Do Sylwka zostało: "+(suma-dzien+1)+"dni");
        System.out.println(dzien+"."+mc+" jest"+(365-(suma-dzien+1))+" roku");
    }
    
}
