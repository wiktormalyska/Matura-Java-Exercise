/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sito;

/**
 *
 * @author wikim
 */
public class Sito {

    public static boolean [] tworzTablice(int n){
        boolean t[]=new boolean[n];
        for (int i=2; i<n;i++) {
            t[i]=true;
        }
        return t;
    }
    public static void pokaz(boolean t[]){
        for (int i = 0; i < t.length; i++) {
            System.out.println(""+(i)+". "+t[i]);
        }
    }
    
    public static boolean [] sito(boolean t[]){
        for(int i=2; i*i<t.length; i++)
        {
            if(t[i]==true)
            {   
                for(int j = i * i; j < t.length; j += i)
                {
                    t[j]=false;
                }
            }
        }
        return t;
    }
     
    public static void   liczbyCzworacze(boolean t[])
    {
        for(int i=0; i<t.length-3; i++){
            if(t[i]==true && t[i+2]==true && t[i+6]==true && t[i+8]==true)
                System.out.println(""+i+","+(i+2)+","+(i+6)+", "+(i+8));
        }
    }
    
    public static void main(String[] args) {
        boolean t[]=tworzTablice(200000);
        t=sito(t);
        pokaz(t);
        System.out.println("Liczby czworacze: ");
        liczbyCzworacze(t);
    }
    
}