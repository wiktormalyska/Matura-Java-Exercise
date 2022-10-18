package matura2019_zad.pkg1;

public class Matura2019_zad1 {

    public static void main(String[] args) {
        int []t = {5,99,3,7,111,13,4,24,4,8};
        
        System.out.println(Jasia(t));
        System.out.println(Jasia2(t));
    }
    
    public static int Jasia(int t[]){
        for (int i = 0; i < t.length; i++) {
            if (t[i]%2==0){
                return t[i];
            }
        }
        return -1;
    }
    
    public static int Jasia2(int t[]){
//        for (int i = t.length-1; i >= 1; i--) {
//            if (t[i]%2==0){
//                continue;
//            } else{
//                return t[i+1];
//            }
//        }
//        return -1;
    int i=t.length-1;
    while(t[i]%2==0){
        i--;
        continue;
    }
    return t[i+1];
    }
//    1. Ustalić licznik i na wartość długości tablicy -1
//    2. Dopóki trafiamy na liczby Jasia to umniejszamy liznik z punktu 1.
//    3. Zwracamy liczbę z komórki i+1
}
