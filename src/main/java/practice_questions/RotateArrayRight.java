package practice_questions;

public class RotateArrayRight {

    public static void main(String[] args) {

        int []b = {1,2,3,4};
        int h = 3;

        rotateRight(b, h);
        for(int i=0; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
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
    public static void rotateRight(int []arr, int k)
    {
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
}
