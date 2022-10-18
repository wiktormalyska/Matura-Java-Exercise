package tabliceee;


public class Tabliceee {

    public static long[][] tablica1(){
        long [][]t=new long[100][3];
        for (int i = 0; i < 100; i++) {
            t[i][0]=i+1;
        }
        for (int i = 0; i < 100; i++) {
            t[i][1]=(long) Math.pow(i+1, 2);
        }
        for (int i = 0; i < 100; i++) {
            t[i][2]=(long) Math.pow(i+1, 3);
        }
        return t;
    }
    public static void PokazTablicelong(long t[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[j][i]+"  ");
                
            }
            System.out.println("\n");
        }
    }
    
public static double [][] przygotuj(int liczbaWierszy, int a, int b){
        double [][]t=new double[liczbaWierszy][3];
        for (int i = 0; i < t.length; i++) {
            t[i][0]=a+Math.random()*(b-a+1);
            t[i][1]=a+Math.random()*(b-a+1);
            t[i][2]=a+Math.random()*(b-a+1);
        }
        return t;
    }
    
    public static boolean sprawdzCzyToTroj(double a, double b, double c){
        if(a+b>c && a+c>b && b+c>a) return true;
        return false;
    }
    
    
    public static String pokazOdp(double [][]t){
        String wynik="";
        int licznik=0;
        for(int i=0; i<t.length; i++)
        {
            String odp="";
            if(sprawdzCzyToTroj(t[i][0], t[i][1], t[i][2])) {
                odp="Tak" ;
                licznik++;
            }
            else odp="Nie";
            wynik=wynik+t[i][0]+" "+t[i][1]+" "+t[i][2]+" "+odp+"\n";
        }
        return wynik=wynik+"\nTak: "+licznik+"\n";
    }
    public static int liczTak(double [][]t){
        int wynik=0;
        for (int i = 0; i < t.length; i++) {
            if(sprawdzCzyToTroj(t[i][0], t[i][1], t[i][2]))wynik++;
        }
        return wynik;

    }
    
    public static void main(String[] args) {
        double [][]t=przygotuj(100, 1, 100);
        System.out.println(pokazOdp(t));
        //System.out.println("Liczenie Tak z funkcji liczTak: "+liczTak(t));
    }
    
}
