package arrays;

public class replaceWithMax {

    public static void replaceNumber(int []a)
    {
        int max = a[0];
        for(int i=0; i<a.length; i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
        int []d = new int[a.length];
        for(int i=0; i<d.length; i++)
        {
            d[i] = max;
        }
        for(int j=0; j<d.length; j++)
        {
            System.out.print(d[j]+" ");
        }
    }

    public static void main(String[] args) {
        replaceNumber(new int[]{1,7,88,4,9,44,6});
    }
}
