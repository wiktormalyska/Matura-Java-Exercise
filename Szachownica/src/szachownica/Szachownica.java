package szachownica;

import java.util.Scanner;

public class Szachownica {

    public static char Liczbanaznak(int liczba){
        char znak = (char)liczba;
        return znak;
    }
    public static char[][] Tablica(char znak1, char znak2, int szerokosc){
        char aktualnyznak = znak1;
        char [][] t = new char[szerokosc][szerokosc];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = aktualnyznak;
                if (aktualnyznak==znak1) {
                    aktualnyznak=znak2;
                } else {
                    aktualnyznak=znak1;
                }
            }
        }
        return t;
    }
    
    public static void Pokaz(char [][]t){
        int liczbaKol=t[0].length;
            for(int i=0; i<t.length; i++){
                for (int j = 0; j <liczbaKol; j++) {
                    System.out.print(t[i][j]+" ");
                }
                System.out.println("");
            }
        }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char bialykwadrat = Liczbanaznak(35);
        char czarnykwadrat = Liczbanaznak(79);
        System.out.println("Biały kwadrat: "+bialykwadrat);
        System.out.println("Czarny kwadrat: "+czarnykwadrat);
        System.out.println("Wpisz szerokość szachownicy: ");
        int szerokosctablicy=s.nextInt();
        char [][] t = Tablica(bialykwadrat, czarnykwadrat, szerokosctablicy);
        Pokaz(t);
    }
}
