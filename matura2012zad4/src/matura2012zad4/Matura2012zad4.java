package matura2012zad4;

public class Matura2012zad4 {

    public static void main(String[] args) {
        String tekstjawny = "MARTA";
        String klucz = "TOR";
        System.out.println(szyfrztablicy(szyfrlitery(tekstjawny, klucz)));
    }
    
    public static char [] wyraznalitery(String wyraz){
        int dlugosc = wyraz.length();
        char [] litery = new char[dlugosc];
        for (int i = 0; i < litery.length; i++) {
            litery [i] = wyraz.charAt(i);
        }
        return litery;
    }
    
    public static int sumazliter(char litera1j, char litera2k){
        int wynik = 0;
        int liczbazlitery1 = litera1j;
        System.out.println(liczbazlitery1);
        int liczbazlitery2 = litera2k;
        System.out.println(liczbazlitery2);
        wynik = litera1j+(litera2k-64);
        if (wynik>90){
                wynik = wynik-26;
            }
        return wynik;
    }
    
    public static char literazliczby(int liczba){
        char litera = (char)liczba;
        return litera;
    }
    
    public static char [] szyfrlitery(String wyraz, String klucz){
        char [] wyrazchar = wyraznalitery(wyraz);
        char [] kluchchar = wyraznalitery(klucz);
        char [] szyfr = new char [1000];
        if (klucz.length()>wyraz.length()) {
            char [] wydluzonatabela = new char [(wyrazchar.length-kluchchar.length)+kluchchar.length];
            for (int i = 0; i < wyraz.length(); i++) {
                if (i>kluchchar.length) {
                    wydluzonatabela[i]=kluchchar[i-kluchchar.length];
                }
                szyfr[i]=literazliczby(sumazliter(wyrazchar[i], wydluzonatabela[i]));
            }
        } else {
            for (int i = 0; i < klucz.length(); i++) {
                szyfr[i]=literazliczby(sumazliter(wyrazchar[i], kluchchar[i]));
            }
        }
        return szyfr;
    }
        
    public static String szyfrztablicy(char [] tablica){
        String wyraz = "";
        for (int i = 0; i < tablica.length; i++) {
            wyraz = wyraz+tablica[i];
        }
        return wyraz;
    }
    
}
