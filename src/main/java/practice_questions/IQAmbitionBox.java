package practice_questions;
/*Given an array, rotate the elements in pairs of three.
For example, given {1, 2, 3, 4, 5, 6, 7, 8, 9}, the result should be {3, 2, 1, 6, 5, 4, 9, 8, 7}.
 */
public class IQAmbitionBox {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reversePortion(arr, 3);
        for(int i=0; i<arr.length; i++){
            System.out.print((arr[i]+" "));
        }
    }
    public static void reversePortion(int []a, int part){

        for(int start = 0; start+part-1<a.length; start = start+part){
            int end  = start+part-1;
            reverseArray(a, start, end);
        }
    }
    public static void reverseArray(int []a, int left, int right){

        while(left < right){

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
