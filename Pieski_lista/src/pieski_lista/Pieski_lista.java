package pieski_lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pieski_lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Pies> lp = new ArrayList<Pies>();
       //lp .add(Pies.);
       Pies a = new Pies("Łatek", 50, "Kundel");
       Pies b = new Pies("abc");
       Pies c = new Pies();
       lp .add(a);
       lp .add(b);
       lp .add(c);
       lp .add(new Pies("Ozi", 35, "Kundel"));
        System.out.println(""+a+"\n"+b+"\n"+c);
        System.out.println(lp);
        System.out.println("----------------------");
        List <Pies> dodane = dodaj(lp);
        pokaz(dodane);
        System.out.println(maxwaga(dodane));
    }
    public static List<Pies> dodaj(List <Pies> lista){
        List <Pies> lp = new ArrayList<Pies>();
        for (Iterator<Pies> iterator = lista.iterator(); iterator.hasNext();) {
            Pies next = iterator.next();
            lp .add(next);
            
        }
        return lp;
    }
    
    public static void pokaz(List <Pies> lista){
        int liczbap = 0;
        for (Iterator<Pies> iterator = lista.iterator(); iterator.hasNext();) {
            Pies next = iterator.next();
            liczbap++;
            System.out.println(next+"\n");
        }
        System.out.println(liczbap);
    }
    
    public static double maxwaga(List <Pies> lista){
        double maxw=lista.get(0).getWaga();
        for (int i = 0; i < lista.size(); i++) {
            if (maxw<lista.get(i).getWaga()){
                maxw = lista.get(i).getWaga();
            }
        }
        return maxw;
    }
}
