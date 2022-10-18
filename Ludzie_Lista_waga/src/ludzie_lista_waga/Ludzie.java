package ludzie_lista_waga;

import java.util.Scanner;

public class Ludzie {
    private String imie;
    private String plec;
    private double waga;

    public Ludzie() {
        imie="Adam";
        plec="m";
        waga=50.0;
    }

    public Ludzie(String imie, double waga) {
        this.imie = imie;
        this.plec = Jakaplec(imie);
        this.waga = waga;
    }
    
    public Ludzie(String a){
        Scanner s=new Scanner(System.in);
        System.out.println("Zadaj Imię: ");
        imie = s.next();
        plec = Jakaplec(imie);
        System.out.println("Zadaj wagę");
        waga = s.nextDouble();
    }
    
    private String Jakaplec(String imie){
        if (imie.endsWith("a")) {
            plec = "k";
        } else {
            plec = "m";
        }
        return plec;
    }
    
    public void GenerujLudzia(){
        Scanner s = new Scanner(System.in);
        System.out.print("Zadaj Imię: ");
        imie = s.next();
        System.out.println("Zadaj Wagę: ");
        waga = s.nextDouble();
        System.out.println("\n\nDane Człowieka:\nImię: "+imie+"\nWaga: "+waga+"\nPłeć: "+Jakaplec(imie));
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
    
    @Override
    public String toString(){
    return "Imie: "+imie+" Płeć: "+plec+" Waga: "+waga;
    }
}
