package arrays;

public class   MergeArray {

    public static void main(String[] args) {

        int []a = {10,20,30};
        int []b = {40,50,60};

        int c_length = a.length + b.length;

        int []c = new int[c_length];
        for(int i =0; i<a.length; i++)
        {
            c[i] = a[i];
        }
        for(int j =0; j<b.length; j++)
        {
            c[a.length+j] = b[j];
        }

        for(int k=0; k<c.length; k++)
        {
            System.out.print(c[k]+" ");
        }
    }
}
