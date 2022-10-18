package konwersje;

public class Konwersje {


    public static void main(String[] args) {
        int liczba=2021;
        String binLiczba=Integer.toBinaryString(liczba);
        System.out.println(liczba+"="+binLiczba);
        String bin="111011";
        liczba=Integer.parseInt(bin, 2);
        System.out.println(bin+"="+liczba);
        String liczbaString="12345";
        liczba=Integer.parseInt(liczbaString);
        System.out.println(liczba);
        liczba=2021;
        String l8=Integer.toOctalString(liczba);
        System.out.println(liczba+"w 10 = "+l8+" w 8koeym");
    }
    
}
