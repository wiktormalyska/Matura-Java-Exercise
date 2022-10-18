package wyrazrasnacy;

import java.util.Scanner;

public class Wyrazrasnacy {

    public static String wczytajNapis(String komunikat){
     System.out.print(komunikat+": ");
     Scanner s= new Scanner(System.in);
      return s.next();
    }
 
    public static boolean czyrosnacy(String napis){
       boolean wynik=true;
       for(int i=0; i<napis.length()-1;i++){
           char pierwszalitera=napis.charAt(i);
           int kodp=(int)pierwszalitera;
           char drugalitera=napis.charAt(i+1);
           int kodd=(int)drugalitera;
           if(kodp<kodd) /*wynik=wynik & true;*/
              wynik&=true;
          else return false;
        }
        return wynik;
    
}
 
    public static void main(String[] args) {
        String napis=wczytajNapis("Podaj napis może on zawierać cyferki");
        System.out.println("Czy napis jest rosnący: "+czyrosnacy(napis));
    }
}