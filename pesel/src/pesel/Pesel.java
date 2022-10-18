
package pesel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author wikim
 */
public class Pesel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("C:\\Users\\wikim\\Desktop\\Informatyka\\pesel.txt");
        System.out.println(ilezgrudnia(czytajPESEL(plik)));
        System.out.println(ilekobiet(czytajPESEL(plik)));
    }
    
    public static String[] czytajPESEL(File plik) throws FileNotFoundException{
        Scanner s = new Scanner(plik);
        
        String[] pesel = new String[150];
        for (int i = 0; i < 150; i++) {
            pesel[i] = s.next();
        }
        return pesel;
    }
    
    public static int ilezgrudnia(String[] pesele){
        int wynik = 0;
        for (int i = 0; i < pesele.length; i++) {
            if (pesele[i].charAt(2)=='1'&pesele[i].charAt(3)=='2') {
                wynik++;
            }
        }
        return wynik;
    }
    
    public static int ilekobiet(String[] pesele){
        int wynik = 0;
        for (int i = 0; i < pesele.length; i++) {
            if ((int)pesele[i].charAt(9)%2==0) {
                wynik++;
            }
        }
        return wynik;
    }
    
    public static List<String> listalat(File pesele) throws FileNotFoundException{
        List<String> lata = new ArrayList<>();
        Scanner s = new Scanner(pesele);
        for (int i = 0; i < pesele.length(); i++) {
            
            String pesel = s.next();
            String rok = rokzpeselu(pesel);
            if (!lata.contains(rok)) {
                lata.add(rok);
            }
        }
            
        return lata;
    }
    public static String rokzpeselu(String pesel){
        char rok1=pesel.charAt(0);
        char rok2=pesel.charAt(1);
        String rok = ""+rok1+rok2;
        return rok;
    }
    
    public static int[][] tablicawystapienlat(List<String> lata, File pesele) throws FileNotFoundException{
        String pesel = "";
        String rok ="";
        Scanner s = new Scanner(pesele);
        int[][]wystapienialat = new int[lata.size()][2];
        for (int i = 0; i < lata.size(); i++) {
            wystapienialat[i][0]=Integer.parseInt(lata.get(i));
        }
        for (int i = 0; i < pesele.length(); i++) {
            pesel = s.next();
            rok = rokzpeselu(pesel);
            
        }
        return wystapienialat;
        
    }
}
