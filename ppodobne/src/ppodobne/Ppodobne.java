package ppodobne;
public class Ppodobne {

    static String wynik = "";
    public static void main(String[] args) {
    //    System.out.println(liczbaz10naN(21, 2));
        System.out.println(suma10(123));
        System.out.println(sumap(21, 2));
        System.out.println(czypodobna(24, 3));
    }
    public static int suma10(int liczba){
        int suma=0;
        while (liczba>0) {            
            suma=suma+liczba%10;
            liczba=liczba/10;
        }
        return suma;
    }
    
    public static int sumap(int liczba, int p){
        int suma=0;
        int k=0;
        int dk=liczba;
        int []ck=new int[32];
        do{
            ck[k]=dk%p;
            dk=dk/p;
            k++;
        }while(dk>0);
        for (int i = k-1; i >=0; i--) {
            System.out.print(ck[i]);
            suma+=ck[i];
        }
        System.out.println("");
        return suma;
    }
    public static boolean czypodobna(int n, int p){
        return (suma10(n)==sumap(n, p))?true:false;
    }
    
    public static String intnastring(int liczba){
        return Integer.toString(liczba);
    }
    
    public static String liczbaz10naN(int liczbaw10,int liczbasystemuliczb){
        String liczbawsystemieN = petladzielenia(liczbaw10, liczbasystemuliczb, wynik);
        return liczbawsystemieN;
    }
    
    public static int reszta(int liczba, int dzielenie){
        System.out.println("Reszta z dzielenia "+liczba+", "+dzielenie+" = "+liczba%dzielenie);
        return liczba%dzielenie;
    }
    
    public static int dzielenie(int liczba, int dzielnik){
        return liczba/dzielnik;
    }
    
    public static String petladzielenia(int liczbaw10, int dzielenie, String wynik){
        wynik = wynik+intnastring(reszta(liczbaw10, dzielenie));
        if (dzielenie(liczbaw10, dzielenie)>0) {
            
            petladzielenia(dzielenie(liczbaw10, dzielenie), dzielenie, wynik);
            
        }
            return wynik;
        }
    
}
