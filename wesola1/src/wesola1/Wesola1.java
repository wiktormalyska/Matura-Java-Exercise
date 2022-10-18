/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wesola1;

/**
 *
 * @author wikim
 */
public class Wesola1 {

    public static void main(String[] args) {
        Start(7);
    }
    public static void Start(int liczba){
        System.out.println(liczba);
        System.out.println(liczbadokwadratu(liczba));
        System.out.println(czywesola(liczba, liczbadokwadratu(liczba)));
    }
    
    public static String czywesola(int liczba, int liczbadokwadratu) {
        

        String liczbajakonapis = podzial(liczbadokwadratu);
        int oddzieloneliczby[] = cyferki(liczbajakonapis);
        int liczba2 = 0;
        for (int i = 0; i < oddzieloneliczby.length; i++) {;
            liczba2=liczba2+oddzieloneliczby[i];
            
        }
        System.out.println(liczba2);
        if (liczba2==liczbadokwadratu) {
            return"Liczba "+liczba+" Smutna";
        } else if (liczba2==1) {
            return "Liczba "+liczba+" Wesoła";
        }
        czywesola(liczba2, liczbadokwadratu(liczba2));
        return "";
    }
    
    public static int liczbadokwadratu(int liczba){
        return (int)Math.pow(liczba, 2);
    }
    
    public static String podzial(int liczba){
        return ""+liczba;
    }
    
    public static int[] cyferki(String napis){
        int t[]=new int[napis.length()];
        for (int i = 0; i < t.length; i++) {
            t[i]=(int)napis.charAt(i)-48;
        }
        return t;
    }
    
}
