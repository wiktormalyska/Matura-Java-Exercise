package funkcje;

public class Funkcje {

    
    public static String przejdz(String skad, String dokad){
        System.out.println("tapu, tapu");
        return "Idę z "+skad+" do "+dokad;
    }
    
    public static void odpal(String co){
        System.out.println("Jer jer jut jut odpalamy "+co);
    }
    
    public static double zaplac(){
        System.out.println("Grzebiemy...w portfelu i ");
        return Math.random()*100;
    }
    
    public static void main(String[] args) {
        /*przejdz("domu", "lidla");
        String napis=przejdz("domu", "obi");
        System.out.println(napis);
        */
        System.out.println(przejdz("kuchni", "pokoju"));
        odpal("skuter");
        odpal("vw golfa");
        odpal("kwiaty koleżance");
        System.out.println(zaplac());
        
        double kasa=zaplac();
        System.out.println("");
    }
    
}
