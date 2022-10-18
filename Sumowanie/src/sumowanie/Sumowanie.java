package sumowanie;

import java.util.Scanner;

public class Sumowanie {

    public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           /* System.out.println("Zadaj liczby a wyznaczę ci ich sumę");
           
           double suma=0;
           char odp;
           do{
               System.out.print("Zadaj liczbe: ");
               double x=s.nextDouble();
               suma=suma+x;
               System.out.println("Sumujemy dalej? [T/N]");
               odp=s.next().charAt(0);
           }while(odp=='T' | odp=='t');
           
           System.out.println("Suma wynosi: "+suma);
           */
           
           
           int suma=0;
           String odpowiedz="Tak";
           while(odpowiedz.equals("Tak")){
            System.out.println("Podaj liczbę: ");
            int liczba=s.nextInt();
            suma=suma+liczba;
            System.out.println("Chcesz dalej? [Tak/Nie]");
            odpowiedz=s.next();
            
           }
           System.out.println("Suma: "+suma);
    }
    
}
