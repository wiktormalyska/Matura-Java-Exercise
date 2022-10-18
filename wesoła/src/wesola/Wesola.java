/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wesola;

/**
 *
 * @author wikim
 */
public class Wesola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(wesola(7));
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
    
    public static String wesola(int liczba){
        int wynik = liczba;
        if (cyferki(podzial(liczba))[0]!=Math.pow(liczba, liczba)){
            return "smutna";
        } else if(cyferki(podzial(liczba))[0]==1){
            return "wesoła";
        }else{
        
        wynik=(int)Math.pow((double)liczba, (double)liczba);
        int cyfry[] = cyferki(podzial(wynik));
        int suma = 0;
        for (int i = 0; i < cyfry.length; i++) {
            suma=suma+(int)Math.pow((double)cyfry[i], (double)cyfry[i]);
        }
        
        return wesola(suma);
        }
        
    }
}
