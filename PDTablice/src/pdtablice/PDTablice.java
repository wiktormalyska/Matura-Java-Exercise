package pdtablice;

import java.util.Scanner;

public class PDTablice {

    public static void BMI(){
        Scanner s=new Scanner(System.in);
        System.out.print("Wpisz wagę w kilogramach: ");
        double kg=s.nextDouble();
        System.out.print("Wpisz wzrost w metrach: ");
        double m=s.nextDouble();
        double bmi=kg/(Math.pow(m, 2));
        System.out.println("\nTwoje BMI:"+(int)bmi);
        if(bmi<18){
            System.out.println("Masz niedowage!");
        } else if(bmi>18 && bmi<25){
            System.out.println("Utrzymujesz się w normie.");
        } else if(bmi>25 && bmi<30){
            System.out.println("Masz nadwagę!");
        } else if(bmi>30){
            System.out.println("Masz otyłość!");
        }
    }
    public static void PktKarne(){
        int punkty=0;
        Scanner s=new Scanner(System.in);
        int wyborpktkarne=0;
        do{
            System.out.println("Wybierz kategorię wykroczeń:\n\n");
            System.out.println("1. Przewóz osób");
            System.out.println("2. Czyny o charakterze szczególnym");
            System.out.println("3. Nieprawidłowe zachowanie się kierujących wobec pieszych");
            System.out.println("4. Niestosowanie się do znaków i sygnałów drogowych");
            System.out.println("5. Nieprzestrzeganie przepisów obowiązujących na skrzyżowaniach");
            System.out.println("6. Nieprzestrzeganie przepisów dotyczących dopuszczalnej prędkości");
            System.out.println("7. Naruszenie przepisów dotyczących wyprzedzania");
            System.out.println("8. Naruszenie innych przepisów o bezpieczeństwie w ruchu drogowym");
        
            System.out.println("Liczba naliczonych punktów:"+punkty);
            System.out.println("\n0. Powrót");
        }while(wyborpktkarne!=0);
        int wybor=s.nextInt();
        
        switch(wybor){
            case 1:
                int wyborprzewoz=0;
                do{
                    System.out.println("\n\n\n=========Przewóz osób=========\n");
                    System.out.println("1. Przewożenie dziecka w pojeździe w sposów niezgodny");
                    System.out.println("2. Przewożenie pasażerów niezgodnie z przepisami o korzustaniu z pasów");
                    System.out.println("3. Naruszenie przepisów dotyczących przewozu dzieci lub młodzieży");
                    System.out.println("4. Naruszenie przepisów dotyczących przewozu dzieci lub młodzieży przez kierującego innym pojazdem");
                    System.out.println("5. Naruszenie przepisów dotyczących przewozu osób niepełnosprawnyc");
                    System.out.println("6. Naruszenie przepisów dotyczących przewozu osób niepełnosprawnych przez kierującego innym pojazdem");
                    System.out.println("7. Przewóz osób pojazjem nieprzystosowanym liczbie przekraczającej liczbie miejsc");
                    System.out.println("\n0. Powrót");
                    wyborprzewoz=s.nextInt();
                    switch(wyborprzewoz){
                        case 1:System.out.println("Dodano: 6 punktów");
                            punkty=punkty+6;
                            System.out.println("Aktualna liczba punktów: "+punkty);break;
                        case 0:return;
                        
                    }
                }while(wyborprzewoz!=0);
                
            case 2:;
        }
    }
    
    public static void Menu(){
        int wybormenu=0;
        do{
            
            Scanner s=new Scanner(System.in);
            System.out.println("\n\n\t=====Menu:=====\n");
            System.out.println("1. Kalkulator BMI");
            System.out.println("2. Licznik punktór karnych");
            
            System.out.println("\n\n0. Wyjdź");
            wybormenu=s.nextInt();
            switch(wybormenu){
                case 1:BMI();break;
                case 2:PktKarne();break;
                
                case 0:return;
            }
        } while(wybormenu!=0);
    }
    
    public static void main(String[] args) {
        Menu();
    }
    
}
