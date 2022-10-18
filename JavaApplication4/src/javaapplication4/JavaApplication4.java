/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author wikim
 */
public class JavaApplication4 {

   public static int [][] przygotuj(int liczbaWierszy, int a, int b){
        int [][]t=new int[liczbaWierszy][3];
        for (int i = 0; i < t.length; i++) {
            t[i][0]=(int )(a+Math.random()*(b-a+1));
            t[i][1]=(int )(a+Math.random()*(b-a+1));
            t[i][2]=(int )(a+Math.random()*(b-a+1));
        }
        return t;
    }
    
    public static boolean czyPierszaJest(int liczba){
        if(liczba==1 || liczba==0) return false;
        if(liczba==2) return true;
        
        for(int dzielnik=2; dzielnik<liczba; dzielnik++){
            if(liczba%dzielnik==0) return false;
        }
        return true;
    }
    
    
    public static int liczPierwsze(int [][]t){
        int licznik=0; //licznik pierwszych
        int liczbaKol=t[0].length;
        for(int i=0; i<t.length; i++){
            for(int j=0; j<liczbaKol; j++){
               if(czyPierszaJest(t[i][j])) licznik++ ;
            }
        }
        return licznik;
    }
    
    public static void pokaz(int [][]t){
        int liczbaKol=t[0].length;
        for(int i=0; i<t.length; i++){
            for(int j=0; j<liczbaKol; j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static int liczbaZlozonych(int [][]t){
        int liczbaLiczb=t.length* t[0].length;
        return liczbaLiczb-liczPierwsze(t);
    }
    
    public static void main(String[] args) {
        int [][]t=przygotuj(3, 1, 100);
        System.out.println("Liczb pierwszych w t jest: "+liczPierwsze(t));
        pokaz(t);
        System.out.println("Złożonych "+liczbaZlozonych(t)+" szt.");
        
        for(int i=0 ; i<=6590; i++){
            System.out.println("Kod: "+i+" to znak "+(char)i);
        }
        System.out.println("-------------------------");
        for(char znak='a'; znak<'w'; znak++){
            System.out.println("Znak "+znak+" ma kod "+(int)znak);
        }
    }
    
}

