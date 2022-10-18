/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pieski_lista;

import java.util.Scanner;


public class Pies {
    private String imie;
    private double waga;
    private String rasa;

    public Pies() {
        imie="Burek";
        waga=40;
        rasa="Owczarek";
    }

    public Pies(String imie, double waga, String rasa) {
        this.imie = imie;
        this.waga = waga;
        this.rasa = rasa;
    }

    public Pies(String abc) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj imię, rasę i wagę");
        imie=s.next();
        rasa=s.next();
        waga=s.nextDouble();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        return "Imie: "+imie+"\n Rasa: "+rasa+"\n Waga: "+waga+"kg";
    }
    
    
    
}


