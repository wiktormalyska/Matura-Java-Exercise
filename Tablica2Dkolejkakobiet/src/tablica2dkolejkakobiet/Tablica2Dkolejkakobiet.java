package tablica2dkolejkakobiet;

import java.util.Scanner;

public class Tablica2Dkolejkakobiet {

    public static double [][] podgladaj(int czasZakupow, int czasProbkowania){
        int wiersze=czasZakupow/czasProbkowania;
        double [][] tgps=new double[wiersze][2];
        for(int i=0; i<wiersze; i++){
                tgps[i][0]=Math.random()*(500-0+1);
                tgps[i][1]=Math.random()*(400-0+1);
        }
        return tgps;
    }
    public static boolean pokaz(double [][]t){
        System.out.println("x\ty");
        for (int i = 0; i <t.length; i++) {
            System.out.println(t[i][0]+"\t"+t[i][1]);
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Ustal czas trwania zakupów: ");
        Scanner s=new Scanner(System.in);
        int czasZakupow=s.nextInt();
        System.out.println("Ustal czas próbkowania: ");
        int czasProbkowania = s.nextInt();
        double [][]tgps=podgladaj(czasZakupow, czasProbkowania);
        pokaz(tgps);
    }
    
}
