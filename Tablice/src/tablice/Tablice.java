package tablice;

import java.util.Scanner;

public class Tablice {

    public static String generujImię(int dlugosc){
        String imie="";
        int kodPierwszaLitera=(int) (65+Math.random()*(90-65+1));
        imie=imie+(char)kodPierwszaLitera;
        for(int i=1; i<dlugosc; i++){
            imie=imie+(char) (int) (97+(Math.random()*(122-97+1)));
        }
        return imie;
    }
    
    public static String [] przygotujTablice(int liczbaosob){
        String []tosob=new String[liczbaosob];
        for(int i=0; i<tosob.length; i++){
        
            tosob[i]=generujImię(3+(int) (Math.random()*(15-3+1)));
        }
        return tosob;
    }
    
    public static void pokaz(String []t){
        for (int i=0; i<t.length; i++){
            System.out.print(t[i]+", ");
        }
    }
    
    public static boolean czyMezczyzna(String imie){
        return !imie.endsWith("a");
    }
    
    public static void pokaz2(String []t){
        for (int i=0; i<t.length; i++){
            String plec=(czyMezczyzna(t[i]))?"Mezczyzna":"Kobieta";
            System.out.println(t[i]+" "+plec);
        }
    }
    
    public static char menu(){
        Scanner s=new Scanner(System.in);
        System.out.println("\n\n\n\t\tMenu:");
        System.out.println("\nU. Ustal ilość osób");
        System.out.println("\nG. Generuj imiona");
        System.out.println("\nP. Pokaż imiona");
        System.out.println("\ng. Pokaż imiona i płeć");
        System.out.println("\nX. Wyjdź z programu");
        System.out.println("\n\n Twój wybór:");
        char wybor=s.next().charAt(0);
        return wybor;
        
    }
    
    public static void main(String[] args) {
       /* System.out.println(generujImię(10));
        String []timie=przygotujTablice(10);
        pokaz2(timie);*/
       Scanner s=new Scanner(System.in);
       char wybor='X';
       int iloscosob=1;
       String []timiona=new String[iloscosob];
       do{
           wybor=menu();
           switch(wybor){
               case 'U':System.out.print("Ile ma być osób?: ");
                        iloscosob=s.nextInt();break;
               case 'G':System.out.println("Generujemy imiona: ");
                        timiona=przygotujTablice(iloscosob);break;
               case 'P':System.out.println("Pokaz imion: ");
                        pokaz(timiona);break;
               case 'g':System.out.println("Generujemy imiona z płcią: ");
                        pokaz2(timiona);break;
               case 'X':wybor='X';break;
               default:System.out.println("Brak opcji");break;
           
           }
       }while(wybor!='X');
    }
    
}
