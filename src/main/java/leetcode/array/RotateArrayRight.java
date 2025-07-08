package leetcode.array;

public class RotateArrayRight {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5, 6, 7};
        rotateRight(arr, 3);

        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateRight(int []b, int k)
    {
        int n = b.length;
        k = k%n;

        reverse(b, 0, n-1);
        reverse(b, k, n-1);
        reverse(b, 0, k-1);
    }

    public static void reverse(int []a, int start, int end)
    {
        while(start<end)
        {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            start++;
            end--;
        }
    }
}
