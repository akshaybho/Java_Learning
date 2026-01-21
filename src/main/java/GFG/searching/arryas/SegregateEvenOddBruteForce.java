package GFG.searching.arryas;

public class SegregateEvenOddBruteForce {

    public static void main(String[] args) {

        int []b = {3, 4, 8, 2, 1, 5};
        separateEvenOdd(b);
    }

    public static void separateEvenOdd(int []a){

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[j]%2!=0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int k=0; k<a.length; k++){
            System.out.print(a[k]+" ");
        }
    }
}
