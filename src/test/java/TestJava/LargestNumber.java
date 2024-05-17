package TestJava;

public class LargestNumber {

    public static void main(String[] args) {

        int[] a = {49, 47, 43, 147, 39, 123};

        int largest = a[0];

        for(int i=1; i<a.length; i++)
        {
           if(a[i]>largest)
           {
               largest = a[i];
           }
        }

        System.out.println("The largest number is = "+largest);


    }
}