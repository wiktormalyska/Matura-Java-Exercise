
package spółgłoska.czy.samogłoska;

import java.util.Scanner;


public class SpółgłoskaCzySamogłoska {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Wpisz literę: ");
        char litera=s.next().charAt(0);
        switch(litera){
            case 'A': ;
            case 'a': ;
            case 'E': ;
            case 'e': ;
            case 'I': ;
            case 'i': ;
            case 'Y': ;
            case 'y': System.out.println(litera+" Jest samogłoską");break;
            case 'B': ;
            case 'b': ;
            case 'C': ;
            case 'c': System.out.println(litera+" Jest spółgłoską");break;
            default: System.out.println("stupid");
        }
    }
    
}
