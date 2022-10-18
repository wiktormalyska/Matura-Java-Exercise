package maturalne4zadsmok;

public class Maturalne4zadsmok {
    
    public static double [][] generujSmoka(double x, double y, int liczbPunktow){
        double [][]t=new double[liczbPunktow][2];
        double xp=0;
        double yp=0;
        t[0][0]=x;
        t[0][1]=y;
        for (int i = 1; i < liczbPunktow; i++) {
            if (Math.random()<0.5) {
                //pierwszy wzor
                xp=-0.4*t[i-1][0]-1.0;
                yp=-0.4*t[i-1][1]+0.1;
            }
            else {
                //drugi wzor
                xp=0.76*t[i-1][0]-0.4*t[i-1][1];
                yp=0.4*t[i-1][0]+0.76*t[i-1][1];
            }
            
            t[i][0]=xp;
            t[i][1]=yp;
        }
        return t;
    }

    public static void pokaz(double [][]t, int pominiete){
        for (int i = pominiete; i < t.length; i++) {
            System.out.print(t[i][0]+"\t");
            System.out.println(t[i][1]);
        }
        
    }
    
    public static double [] srodekmasysmoka(double [][]t, int pomin){
        double []sm=new double [2];
        double sx=0;
        double sy=0;
        for (int i = pomin; i < t.length; i++) {
            sx+=t[i][0];
            sy+=t[i][1];
        }
        sx=sx/(t.length-pomin);
        sy=sy/(t.length-pomin);
        
        sm[0]=sx;
        sm[1]=sy;
        return sm;
    }
    public static void minmax(double [][]t, int pomin){
        double maxx=t[0][0];
        double maxy=t[0][1];
        double minx=t[0][0];
        double miny=t[0][1];
        for (int i = pomin; i <t.length; i++) {
            if (maxx<t[i][0]) maxx=t[i][0];
            if (maxy<t[i][1]) maxy=t[i][1];
            if (minx>t[i][0]) minx=t[i][0];
            if (miny>t[i][1]) miny=t[i][1];
        }
        System.out.format("\nMinX: %-+20.1f\nMaxX: %-+20.1f\nMinY: %-+20.1f\nMaxY: %-+10.1f\n", minx, maxx, miny, maxy);
    }

    public static void main(String[] args) {
        double [][]t=generujSmoka(1.0, 1.0, 5000);
        pokaz(t, 100);
        double []sm=srodekmasysmoka(t, 100);
        System.out.println("Środek masy smoka: "+sm[0]+"\t"+sm[1]);
        System.out.format("Środek masy smoka to punkt Q("
                + "%.1f ; %.1f )", sm[0], sm[1]);
        minmax(t, 100);
    }
    
}
