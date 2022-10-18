package badanienazwisk;

import java.util.Scanner;


public class machina {
    private String imie;
    private String nazwisko;

    public machina() {
        imie ="Wiktor";
        nazwisko="Małyska";
    }

    public machina(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    public machina(char znak){
        Scanner s=new Scanner(System.in);
        System.out.println("Zadaj Imię i Nazwisko: ");
        imie=s.next();
        nazwisko=s.next();
    
    }
    
    public String getImie(){
        return nazwisko;
    }
    
    public void setImie(String imie){
        this.imie=imie;
    }
    
    public String getNazwisko(){
        return nazwisko;
    }
    
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    
    public String badanieNazwiska(){
    
    if(nazwisko.endsWith("ski")||nazwisko.endsWith("cki")||nazwisko.endsWith("ska")||nazwisko.endsWith("cka")) return nazwisko+" jest pochodzenia polskiego.";
    else return nazwisko+" jest obce.";
        
    }
    
    public String badanieplci(){
        if(imie.endsWith("a") ||imie.endsWith("A")|| !imie.equals("Iris")) return "Kobieta";
        else return "Mężczyzna";
        
    
    }
    
    public byte dlugoscImieniaINazwiska(){
        int wynik = imie.length()+1+nazwisko.length();
        return (byte)wynik;
    }
    
    
}
