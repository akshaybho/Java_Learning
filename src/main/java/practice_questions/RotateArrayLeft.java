package practice_questions;

public class RotateArrayLeft {

    public static void main(String[] args) {

       int []arr = {1, 2, 3, 4, 5, 6, 7};

       rotateLeft(arr, 4);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
       }
       public static void rotateLeft(int []b, int k)
       {
           int n = b.length;
           k = k%n;

           reverse(b, 0, n-1);
           reverse(b, 0, k);
           reverse(b, k+1, n-1);
       }

       public static void reverse(int []a, int start, int end)
       {
           while(start<end)
           {
               int temp = a[start];
               a[start] = a[end];
               a[end] = temp;

               start++;
               end--;
           }
       }
    }

