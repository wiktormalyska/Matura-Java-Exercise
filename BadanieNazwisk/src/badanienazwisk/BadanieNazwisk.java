/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badanienazwisk;

/**
 *
 * @author wikim
 */
public class BadanieNazwisk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        machina sobota= new machina('r');
        System.out.println("Liczba wszystkich liter do zapisu: "+sobota.dlugoscImieniaINazwiska());
        System.out.println("Płeć: "+sobota.badanieplci());
        System.out.println("Nazwisko: "+sobota.badanieNazwiska());
        System.out.println("Pierwsza litera imienia: "+sobota.getImie().charAt(0));
    }
    
}
