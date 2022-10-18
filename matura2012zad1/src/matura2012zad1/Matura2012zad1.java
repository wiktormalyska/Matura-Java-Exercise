/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matura2012zad1;

public class Matura2012zad1 {

    public static void main(String[] args) {
        int [] a = new int[]{5,1,8,9,7,2,3,11,20,15};
        System.out.println(funkcjaF (9, a));
        System.out.println(funkcjaF(7, a));
        System.out.println(funkcjaF(5, a));
    }
    
    public static int funkcjaF(int i, int [] a){
        int n = a.length;
        if (i==n) {
            return n;
        } else {
            int j = funkcjaF(i+1, a);
            if (a[i-1]<a[j-1]) {
                return i;
            } else {
                return j;
            }
            
        }
    }
    
}
