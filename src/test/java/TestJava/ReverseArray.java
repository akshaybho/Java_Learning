package TestJava;

public class ReverseArray {

    public static  void reverseArray(int []a)
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i =a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []b = {1,2,3,4,5,6,7,8};
        reverseArray(b);
    }
}
