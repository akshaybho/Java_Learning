package arrays;

public class HighestProduct {

    public static void findMaxProduct(int []a)
    {
        // 1. covert array to ascending
        for(int i=0; i<a.length; i++)
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
        // 2) take last two digits of array
        int c=0,d = 0;
        for(int k=0; k<a.length; k++)
        {
            c = a[a.length-1];
            d = a[a.length-2];
        }
        System.out.println(c*d);
    }

    public static void main(String[] args) {

        findMaxProduct(new int[]{-1,2,4,-2,6,-5,3,8});
    }
}
