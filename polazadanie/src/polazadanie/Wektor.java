/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polazadanie;

/**
 *
 * @author wikim
 */
public class Wektor {
    private double x;
	private double y;
        private double z;
	Wektor(){
		x=y=z=0;
	}

    public Wektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

	Wektor(Punkt A, Punkt B){
		x=B.getX()-A.getX();
		y=B.getY()-A.getY();
                z=B.getZ()-A.getZ();
        }
        
    public double dlugosc(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
        
}
        
