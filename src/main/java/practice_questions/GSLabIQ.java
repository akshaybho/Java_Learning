package practice_questions;

public class GSLabIQ {

    public static void main(String[] args) {

        int []arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;
        separateParts(arr, splitSize);
    }

    public static void separateParts(int []a, int count)
    {
        for(int i=0; i<a.length; i=i+count)
        {
            int end = Math.min(a.length, count+i);
            System.out.print("[");
            for(int j=i; j<end; j++)
            {
                System.out.print(a[j]);
                if(j<end-1)
                {
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
    }
}
