package zad3;

public class Zad3 {
    
public static int [][] przygotuj(int liczbaWierszy, int a, int b){
        int [][]t=new int[liczbaWierszy][3];
        for (int i = 0; i < t.length; i++) {
            t[i][0]=(int)(a+Math.random()*(b-a+1));
            t[i][1]=(int)(a+Math.random()*(b-a+1));
            t[i][2]=(int)(a+Math.random()*(b-a+1));
        }
        return t;
    }

    public static boolean czyPierwszaJest(int liczba){
        if(liczba==1 ||liczba==0) return false;
        if(liczba==2)return true;
        for (int dzielnik = 2; dzielnik <liczba; dzielnik++) {
            if(liczba%dzielnik==0) return false;
        }
        return true;
    }
    public static int liczPierwsze(int [][]t){
        int licznik=0;
        int liczbaKol=t[0].length;
        for(int i=0; i<t.length; i++){
            for (int j = 0; j <liczbaKol; j++) {
                if (czyPierwszaJest(t[i][j])) {
                    licznik++;
                }
            }
        }
        return licznik;
    }
    
    public static void Pokaz(int [][]t){
        int liczbaKol=t[0].length;
            for(int i=0; i<t.length; i++){
                for (int j = 0; j <liczbaKol; j++) {
                    System.out.print(t[i][j]+" ");
                }
                System.out.println("");
            }
        }
    
   public static int Zlozone(int [][]t){
       int liczbaLiczb=t.length*t[0].length;
       return liczbaLiczb-liczPierwsze(t);
   }
    
   
    public static void main(String[] args) {
        System.out.println(czyPierwszaJest(7));
        int [][]t=przygotuj(3, 1, 100);
        System.out.println("Licz pierwszych w t jest: "+liczPierwsze(t));
        Pokaz(t);
        System.out.println("Złożonych jest: "+Zlozone(t));
    }
    
}
