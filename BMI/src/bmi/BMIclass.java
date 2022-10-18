package bmi;


public class BMIclass {
    double waga;
    double wzrost;

    public BMIclass() {
        waga=0.0;
        wzrost=0.0;
        
    }

    public BMIclass(double waga, double wzrost) {
        this.waga = waga;
        this.wzrost = wzrost;
    }
    
    public double obliczbmi(){
        double bmi=0;
        bmi=this.waga/(Math.pow((this.wzrost/100), 2));
        return bmi;
        
    }
    
    public void opis(double bmi){
        if (bmi<18.0){
            System.out.println("Klient ma niedowagę");
        } else if(bmi>=18.0 && bmi<25.0){
            System.out.println("Klient ma prawidłową wagę");
        } else if(bmi>=25.0 && bmi<30.0){
            System.out.println("Klient ma nadwagę");
        } else if(bmi>=30.0 && bmi<40.0){
            System.out.println("Klient ma otyłość");
        } else if(bmi>=40.0){
            System.out.println("Klient ma otyłość ekstremalną");
        }
        
    }
    
}
