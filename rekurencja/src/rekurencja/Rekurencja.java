package rekurencja;

public class Rekurencja {

    public static void main(String[] args) {
        System.out.println(silnia2(4));
        System.out.println(krolik(12));
        System.out.println(zadanie(1000));
        double [] t = {2,1,-3,1};
        System.out.println(horner(t, 2, t.length-1));
        System.out.println(licz(32));
        System.out.println(nwd(54, 888));
        System.out.println(nww(6, 8));
    }
    
    public static long silnia(int n){
        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik = wynik * i;
        }
        return wynik;
    }
    
    public static long silnia2(int n){
        if (n==0||n==1) {
            return 1;
        } else {
            return silnia2(n-1)*n;
        }
    }
    
    public static long krolik(int n){
        if (n==0||n==1) {
            return 1;
        } else {
            return krolik(n-1)+krolik(n-2);
        }
    }
    
    public static double zadanie(int n){
        if (n==1) {
            return 0.25;
        } else{
            return 1/(1-zadanie(n-1));
        }
    }
    
    public static double horner(double [] t, double x, int stopien){
        if (stopien==0) {
            return t[0];
        } else {
            return horner(t, x, stopien-1)*x+t[stopien];
        }
    }
    
    public static long licz(int x){
        if (x==1) {
            return 1;
        } else {
            long w=licz(x/2);
            if (x%2==1) {
                return w+1;
            } else {
                return w-1;
            }
        }
    }
    
    public static int nwd(int a, int b){
        //Ustawienie liczby a tak żeby była największa
        if (b>a){
            int b1=b;
            int a1=a;
            a=b1;
            b=a1;
        }
        if (a%b==0){
             return b;
         } else{
             return nwd(b, a%b);
         }
    }
    
    public static int nww(int a, int b){
        if (b>a){
            int b1=b;
            int a1=a;
            a=b1;
            b=a1;
        }
        
        return (Math.abs(a*b))/nwd(a, b);
    }
}
