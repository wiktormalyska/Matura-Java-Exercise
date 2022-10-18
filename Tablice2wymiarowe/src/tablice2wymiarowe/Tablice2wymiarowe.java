package tablice2wymiarowe;

public class Tablice2wymiarowe {

    public static int [][] generuj(){
        int [][] t=new int [10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                t[i][j]=(int) (Math.random()*10);
                
            }
        }
        return t;
    }
    
    public static void pokaz(int [][]t){
        System.out.println("Nasza tablica");
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    public static int przekatna(int [][]t){
        int suma=0;
        for (int i=0; i<10; i++){
            suma+=t[i][i];
        }
        return suma;
    }

    public static void main(String[] args) {
        int [][] t=generuj();
        pokaz(t);
        System.out.println("Suma na przękątnej wynosi: "+przekatna(t));
        
        
    }
    
}
