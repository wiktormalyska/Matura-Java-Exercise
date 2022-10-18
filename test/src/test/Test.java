package test;

import java.util.Scanner;



public class Test {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Zadaj liczbę[1...10] a powiem Ci czy jets pierwsza czy złożona: ");
        byte liczba=s.nextByte();
        /*if(liczba==1 || liczba==4 || liczba==6 || liczba==8 || liczba==10)
        {
            System.out.println("");
        }
        else{
            
        }
        */
        
        switch(liczba){
            case 1: ;
            case 4: ;
            case 6: ;
            case 8: ;
            case 9: ;
            case 10: System.out.println("Twoja liczba "+liczba+" jest złożona");break;
            case 2: ;
            case 3: ;
            case 5: ;
            case 7: System.out.println(liczba+" jest pierwsza"); break;
            default:System.out.println("Hello! umówiliśmy się na liczby z [1, 10]");break;
        }
        System.out.println("Dzięki");

    }
    
}
