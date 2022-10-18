package pentle;

public class Pentle {

    public static void main(String[] args) {
        
        int licznik=1;
        while(licznik<=10){
            System.out.println(licznik+" Nie będę ciągnąć Kaści za warkocze");
            licznik++; 
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        int zliczanie=10;
        do{
            System.out.println(zliczanie+" Nie będę ciągnąć Kaści za warkocze");
            zliczanie--;
        }while(zliczanie>0);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" Nie będę ciągnąć Kaści za warkocze");
        }
    }
}
