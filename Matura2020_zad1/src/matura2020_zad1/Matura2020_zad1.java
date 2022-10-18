package matura2020_zad1;

public class Matura2020_zad1 {

    public static void main(String[] args) {
//        int A[] = {4,7,1,4,5};
//        int B[] = {1,4,5,4,7};
//        int k = 2;
          int A[] = {4,2,4,4,2,6};
          int B[] = {4,4,2,6,4,2};
          int k = 2;
        System.out.println(czy_k_podobne(A, B, k));
        System.out.println(czy_k_podobne(A.length, A, B, k));
    }
    public static boolean czy_k_podobne(int n, int A[], int B[], int k){
        boolean odp = true;
            for (int i = 0; i < n; i++) {
                if (czy_k_podobne(A, B, i)==true){
                    odp |=true;
                    System.out.println(i);
                } else{
                odp |= false;
                }
            }
            return odp;
    }
    
    public static boolean czy_k_podobne(int A[], int B[], int k){
        boolean odp = true;
        for (int i = 0; i < k; i++) {
            if (A[i]==B[B.length-k+i]){
                odp = true; 
            } else {
                return false;
            }
        }
        
        for (int i = 0; i <= k; i++) {
            if (B[i]==A[i+k]){
                odp = true;
            } else {
                return false;
            }
        }
        return odp;
    }
    
}
