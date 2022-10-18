/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicounter;

import java.util.Scanner;

/**
 *
 * @author Wiktor
 */
public class BMICOUNTER {

    public static double bmi(double wag, double wys){
    double wys2=Math.pow(wys, 2)/100;
    double bmi=wag/wys2;
    return (bmi)*100;
    }
    
    
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.print("Wpisz swoją wysokość w centymetrach: ");
        double wys=s.nextInt();
        System.out.println("Wpisz swoją wagę w kilogramach: ");
        double wag=s.nextInt();
        System.out.println(bmi(wag, wys));
    }
    
}
