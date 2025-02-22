package arrays;

public class Array_1 {

    public static void main(String[] args) {

        int []a = arr();

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static int[] arr()
    {
        return new int[] {1,2,3,4,5,6};
    }
}
