package ludzie_lista_waga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ludzie_Lista_waga {

    public static void main(String[] args) {
        List <Ludzie> ll= new ArrayList<Ludzie>();
        Ludzie a = new Ludzie("Jakub", 73.0);
        Ludzie b = new Ludzie("Olaf", 58.0);
        Ludzie c = new Ludzie("Gabrys", 92.0);
        Ludzie d = new Ludzie("Iga", 44.0);
        Ludzie e = new Ludzie("Anna", 59.0);
        Ludzie f = new Ludzie("Ola", 85.0);
        Ludzie g = new Ludzie("Filip", 68.0);
        Ludzie h = new Ludzie("Ala", 88.0);
        ll .add(a);
        ll .add(b);
        ll .add(c);
        ll .add(d);
        ll .add(e);
        ll .add(f);
        ll .add(g);
        ll .add(h);
        

        int iloscludzi = iloscludzi(ll);
        pokaz(iloscludzi, ll);
        najciezszyfacet(iloscludzi, ll);
        najlzejszababka(iloscludzi, ll);
    }
    
    public static List<Ludzie> dodaj(List <Ludzie> ll){
        List <Ludzie> ld = new ArrayList<Ludzie>();
        for (Iterator<Ludzie> iterator = ld.iterator(); iterator.hasNext();) {
            Ludzie next = iterator.next();
            ld .add(next);
        }
        return ld;
    }
    
    public static int iloscludzi(List <Ludzie> ll){
        int iloscludzi = 0;
        for (Iterator<Ludzie> iterator = ll.iterator(); iterator.hasNext();) {
            Ludzie next = iterator.next();
            iloscludzi++;
            
        }
        System.out.println("Ilość Ludzi: "+iloscludzi);
        return iloscludzi;
    }
    public static void pokaz(int il, List <Ludzie> ll){
        for (int i = 0; i < il; i++) {
            System.out.println(ll.get(i).getImie()+"\t"+ll.get(i).getPlec()+"\t"+ll.get(i).getWaga());
        }
    }
    
    public static void najciezszyfacet(int ilosc_ludzi, List <Ludzie> ludzie){
        double Najwag= 0.0;
        String Najimie = null;
        for (int i = 0; i < ilosc_ludzi; i++) {
            if (ludzie.get(i).getPlec()=="m") {
                String najaimie = ludzie.get(i).getImie();
                double najawag = ludzie.get(i).getWaga();
                if (Najwag<ludzie.get(i).getWaga()){
                    Najwag = najawag;
                    Najimie = najaimie;
                }
            }
        }
        System.out.println("Najcięższy facet:\nImie: "+Najimie+"\nWaga: "+Najwag);
    }
    
    public static void najlzejszababka (int ilosc_ludzi, List <Ludzie> ludzie){
        double Najwag= ludzie.get(0).getWaga();
        String Najimie = null;
        for (int i = 0; i < ilosc_ludzi; i++) {
            if (ludzie.get(i).getPlec()=="k") {
                String najaimie = ludzie.get(i).getImie();
                double najawag = ludzie.get(i).getWaga();
                if (Najwag>ludzie.get(i).getWaga()){
                    Najwag = najawag;
                    Najimie = najaimie;
                }
            }
        }
        System.out.println("Najlżejsza Kobieta:\nImie: "+Najimie+"\nWaga: "+Najwag);
    }
}
