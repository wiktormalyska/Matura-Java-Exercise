package szyfrcezara;

public class SzyfrCezara {

    public static void main(String[] args) {
        System.out.println(szyfrwiadomosc("STRAJK", 34));
        System.out.println(deszyfrwiadomosc("ABZIRS", 34));
    }
    
    public static char szyfruj(char znak, int klucz){
        klucz = klucz%26;
        int kod = (int)znak;
        kod = kod + klucz;
        if (kod>90) {
            kod=kod-26;
        }
        return (char)kod;
    }
    
    public static String szyfrwiadomosc(String wyraz, int klucz){
        String wynik = "";
        for (int i = 0; i < wyraz.length(); i++) {
            wynik += szyfruj(wyraz.charAt(i), klucz);
        }
        return wynik;
    }
    
    public static char deszyfruj(char znak, int klucz){
        klucz = klucz%26;
        int kod = (int)znak;
        kod = kod - klucz;
        if (kod<65) {
            kod=kod+26;
        }
        return (char)kod;
    }
    
    public static String deszyfrwiadomosc(String wyraz, int klucz){
        String wynik = "";
        for (int i = 0; i < wyraz.length(); i++) {
            wynik += deszyfruj(wyraz.charAt(i), klucz);
        }
        return wynik;
    }
}
