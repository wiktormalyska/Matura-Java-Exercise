package formant;


public class Formant {

    public static void main(String[] args) {
        String []imie={"Jan", "Katarzyna", "Bolek"};
        String []nazwisko={"Krawężnik", "Rura", "Cienki"};
        char []litery={'j','r','b'};
        double []kieszonkowe={120.45, 300.45, 0.48};
        int []wiek={8, 19, 17};
        for (int i = 0; i <imie.length; i++) {
            System.out.format("%-12s\t%-12s\t%-3c\t%6.2f$\t%-3dlat\t%3.2f%%\n", imie[i], nazwisko[i], litery[i], kieszonkowe[i], wiek[i], 1+Math.random()*(100.0));
        }

    }
    
}
