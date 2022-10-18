package bmi;

public class BMI {

    public static void main(String[] args) {
        BMIclass bmi=new BMIclass(60.0, 177.7);
        double bminum = bmi.obliczbmi();
        System.out.println("BMI Klienta: "+bminum);
        bmi.opis(bminum);
        
    }
    
}
