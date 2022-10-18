/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menupd;

import java.util.Scanner;


public class pies {
    private String kolor;
    private String rasa;
    private double masa;
    private double wysokosc;
    private double dlugosc;
    private String imie;
    private double dlugoscPPlapy;
    private double dlugoscLPlapy;
    private double dlugoscPTlapy;
    private double dlugoscLTlapy;
    private String kolorPPlapy;
    private String kolorLPlapy;
    private String kolorPTlapy;
    private String kolorLTlapy;
    private Scanner s=new Scanner(System.in);

    public pies() {
        kolor="biały";
        rasa="kundel";
        masa=25.5;
        wysokosc=50.0;
        dlugosc=70.0;
        imie="Burek";
        dlugoscPPlapy=10.0;
        dlugoscLPlapy=10.0;
        dlugoscPTlapy=10.0;
        dlugoscLTlapy=10.0;
        kolorPPlapy="Biała";
        kolorLPlapy="Biała";
        kolorPTlapy="Biała";
        kolorLTlapy="Biała";
    }

    public pies(String kolor, String rasa, double masa, double wysokosc, double dlugosc, String imie, double dlugoscPPlapy, double dlugoscLPlapy, double dlugoscPTlapy, double dlugoscLTlapy, String kolorPPlapy, String kolorLPlapy, String kolorPTlapy, String kolorLTlapy) {
        this.kolor = kolor;
        this.rasa = rasa;
        this.masa = masa;
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
        this.imie = imie;
        this.dlugoscPPlapy = dlugoscPPlapy;
        this.dlugoscLPlapy = dlugoscLPlapy;
        this.dlugoscPTlapy = dlugoscPTlapy;
        this.dlugoscLTlapy = dlugoscLTlapy;
        this.kolorPPlapy = kolorPPlapy;
        this.kolorLPlapy = kolorLPlapy;
        this.kolorPTlapy = kolorPTlapy;
        this.kolorLTlapy = kolorLTlapy;
    }

    
    public String getKolor(){
        return kolor;
    }
    
    public void setKolor(){
        System.out.print("\nUstaw nowy kolor: ");
        kolor=s.next();
    }
    public String getRasa(){
        return rasa;
    }
    
    public void setRasa(){
        System.out.print("\nUstaw nową rasę: ");
        rasa=s.next();
    }
    
    public double getMasa(){
        return masa;
    }
    
    public void setMasa(){
        System.out.println("Ustaw nową masę: ");
        masa=s.nextDouble();
    }
    
    public double getWysokosc(){
        return wysokosc;
    }
    
    public void setWysokosc(){
        System.out.println("Ustaw nową wysokosc: ");
        wysokosc=s.nextDouble();
    }
    
    public double getDlugosc(){
        return dlugosc;
    }
    
    public void setDlugosc(){
        System.out.println("Ustaw nową długość: ");
        dlugosc=s.nextDouble();
    }

    public String getImie(){
        return imie;
    }
    
    public void setImie(){
        System.out.print("\nUstaw nowe Imie: ");
        imie=s.next();
    }
    
    public void menu(){
        String mwybor;
        System.out.println("==========Menu==========");
        System.out.println("I - Imie Psa: "+imie);
        System.out.println("K - Kolor Psa: "+kolor);
        System.out.println("R - Rasa Psa: "+rasa);
        System.out.println("M - Masa Psa: "+masa);
        System.out.println("W - Wysokość Psa: "+wysokosc);
        System.out.println("D - Długość Psa: "+dlugosc);
        System.out.println("L - Ustawienia Łap");
        System.out.println("X - Wyjdź");
        mwybor=s.next();
        switch(mwybor){
            case "I":setImie();menu();break;
            case "K":setKolor();menu();break;
            case "R":setRasa();menu();break;
            case "M":setMasa();menu();break;
            case "W":setWysokosc();menu();break;
            case "D":setDlugosc();menu();break;
            case "L":lapy();menu();break;
            case "X":System.exit(0);
            default:menu();
        }
    }
    
    public void lapy(){
        String wybor;
        System.out.println("==========Menu Łap==========\n\n");
        System.out.println("PP - Prawa przednia łapa");
        System.out.println("LP - Lewa przednia łapa");
        System.out.println("PT - Prawa tylnia łapa");
        System.out.println("LT - Lewa tylnia łapa");
        System.out.println("X - Wyjdź");
        System.out.println("\n\n Wybór:[PP, LP, PT, LT, X]");
        wybor=s.next();
        switch(wybor){
            case "PP": PPlapa();break;
            case "LP": LPlapa();break;
            case "PT": PTlapa();break;
            case "LT": LTlapa();break;
            case "X": menu();
            default: lapy();
        
        }
        
    }
    private void PPlapa(){
        String wyborPP;
        System.out.println("==========Prawa Przednia łapa==========");
        System.out.println("Długość łapy: "+dlugoscPPlapy);
        System.out.println("Kolor łapy: "+kolorPPlapy);
        System.out.print("\n\n Czy chcesz zmienić ustawienie?[TAK, NIE]");
        wyborPP=s.next();
        switch(wyborPP){
            case "TAK": System.out.println("Wpisz nową długość łapy: ");dlugoscPPlapy=s.nextDouble();System.out.println("Wpisz nowy kolor łapy: ");kolorPPlapy=s.next();PPlapa();break;
            case "NIE": lapy();break;
            default: System.out.println("Wpisano nie poprawną wartość"); PPlapa();break;
        
        }
        
    }
    private void LPlapa(){
        String wyborLP;
        System.out.println("==========Lewa Przednia łapa==========");
        System.out.println("Długość łapy: "+dlugoscLPlapy);
        System.out.println("Kolor łapy: "+kolorLPlapy);
        System.out.print("\n\n Czy chcesz zmienić ustawienie?[TAK, NIE]");
        wyborLP=s.next();
        switch(wyborLP){
            case "TAK": System.out.println("Wpisz nową długość łapy: ");dlugoscLPlapy=s.nextDouble();System.out.println("Wpisz nowy kolor łapy: ");kolorLPlapy=s.next();LPlapa();break;
            case "NIE": lapy();break;
            default: System.out.println("Wpisano nie poprawną wartość"); LPlapa();break;
        
        }
        
    }
    private void PTlapa(){
        String wyborPT;
        System.out.println("==========Prawa Tylnia łapa==========");
        System.out.println("Długość łapy: "+dlugoscPTlapy);
        System.out.println("Kolor łapy: "+kolorPTlapy);
        System.out.print("\n\n Czy chcesz zmienić ustawienie?[TAK, NIE]");
        wyborPT=s.next();
        switch(wyborPT){
            case "TAK": System.out.println("Wpisz nową długość łapy: ");dlugoscPTlapy=s.nextDouble();System.out.println("Wpisz nowy kolor łapy: ");kolorPTlapy=s.next();PTlapa();break;
            case "NIE": lapy();break;
            default: System.out.println("Wpisano nie poprawną wartość"); PTlapa();break;
        
        }
        
    }
    private void LTlapa(){
        String wyborLT;
        System.out.println("==========Lewa Tylnia łapa==========");
        System.out.println("Długość łapy: "+dlugoscLTlapy);
        System.out.println("Kolor łapy: "+kolorLTlapy);
        System.out.print("\n\n Czy chcesz zmienić ustawienie?[TAK, NIE]");
        wyborLT=s.next();
        switch(wyborLT){
            case "TAK": System.out.println("Wpisz nową długość łapy: ");dlugoscLTlapy=s.nextDouble();System.out.println("Wpisz nowy kolor łapy: ");kolorLTlapy=s.next();LTlapa();break;
            case "NIE": lapy();break;
            default: System.out.println("Wpisano nie poprawną wartość"); LTlapa();break;
        
        }
        
    }
}
