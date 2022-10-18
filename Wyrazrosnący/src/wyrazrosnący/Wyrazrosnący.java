
package wyrazrosnacy;

import java.util.Scanner;

public class Wyrazrosnacy {

    public static boolean czyjestrosnaca(String wyraz){
        boolean rosnaca=false;
        int dlugoscwyrazu= wyraz.length();
        for (int i = 0; i < dlugoscwyrazu; i++) {
            char litera = wyraz.charAt(i);
            if (i!=dlugoscwyrazu) {
                if ((int)litera<(int)wyraz.charAt(i+1)) {
                    rosnaca=true;
                } else{
                    rosnaca=false;
                }
            }
        }
        
        return rosnaca;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Wpisz wyraz, a powiem ci czy jest rosnący: ");
        String wyraz = s.next();
        System.out.println(czyjestrosnaca(wyraz));
    }
    
}
