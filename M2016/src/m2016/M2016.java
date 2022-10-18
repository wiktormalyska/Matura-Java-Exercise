package m2016;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class M2016 {
 
    
    public static double[][] wczytaj(String sciezka) throws FileNotFoundException{
        File plik=new File(sciezka);
        Scanner s=new Scanner(plik);
        double [][] dane=new double[10000][2];
        for(int i =0; i<dane.length; i++){
            for(int j=0; j<2; j++){
                dane[i][j]=s.nextDouble();
            }
        }
        return dane;
    }
    
    
    public static void pokaz(double [][]t)
    {
        for(int i =0; i<t.length; i++){
            for(int j=0; j<2; j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    
    public static boolean czyPNalezyDoBrzegu(double x, double y){
        if(Math.pow(x-200.0, 2.0) + Math.pow(y-200.0, 2.0)==40000.0) 
            return true;
        
        return false;
    }
    
    public static boolean czyPNWKola(double x, double y){
        if(Math.pow(x-200.0, 2.0) + Math.pow(y-200.0, 2.0)< 40000.0) 
            return true;
        
        return false;
    }
    
    public static int liczbaPunktowWewnatrzKolaBezBrzegu(double [][]t){
        int licznik=0;
        for(int i=0; i<t.length; i++){
            if(czyPNWKola(t[i][0], t[i][1]))
                licznik++;
        }
        return licznik;
    }
    
    public static void punktyZBrzegu(double [][]t){
        for(int i=0; i<t.length;i++){
            if(czyPNalezyDoBrzegu(t[i][0], t[i][1])){
                System.out.println("("+t[i][0]+" ; "+ t[i][1]+ ")");
            }
        }
    }
    
    public static double przyblizeniePi(int nk, int n){
        return (4.0*nk)/n;
    }
    
    public static int nk(double[][]t, int n){
        int licznik=0;
        for (int i = 0; i < n; i++) {
            if (czyPNalezyDoBrzegu(t[i][0], t[i][1]) || czyPNWKola(t[i][0], t[i][1])) licznik++;
        }
        return licznik;
    }
    
    public static double en(double pin){
        return Math.abs(Math.PI-pin);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        double [][]t=wczytaj("C:\\Users\\wikim\\Desktop\\punkty.txt");
        pokaz(t);
        System.out.println("4.1");
        punktyZBrzegu(t);
        System.out.println("Liczba punktów wewnątrz koła, ale nie należacych do brzegu"
                + ": "+liczbaPunktowWewnatrzKolaBezBrzegu(t));  
        System.out.println("4.2");
        System.out.format("Pi dla 1000 pkt.: %.4f\n",przyblizeniePi(nk(t, 1000), 1000));
        System.out.format("Pi dla 5000 pkt.: %.4f\n",przyblizeniePi(nk(t, 5000), 5000));
        System.out.format("Pi dla 10000 pkt.: %.4f\n",przyblizeniePi(nk(t, 10000), 10000));
        System.out.println("4.3");
        for (int i = 1; i <= 1700; i++) {
            System.out.println(en(przyblizeniePi(nk(t, i), i)));
        }
        
    }
    
}