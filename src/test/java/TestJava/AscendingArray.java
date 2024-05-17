package TestJava;

public class AscendingArray {

    public static int[] asc(int []a)
    {
        for(int i=0; i<a.length-1; i++)
        {
            int temp;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int []b = {3, 12, 14, 2, 7, 5, 6, 8, 11, 1};
        asc(b);
        for(int i=0; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
