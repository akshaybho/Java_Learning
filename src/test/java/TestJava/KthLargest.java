package TestJava;

public class KthLargest {

    public static int[] Kthlarg(int n)
    {
        int []a = {49, 47, 43, 147, 39, 123};
        int temp;
        for(int i=0; i<a.length; i++)
        {
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

        for(int i=0; i<a.length; i++)
        {
            if(i==n)
            {
                System.out.println(n+"th largest number = "+a[i]);
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        Kthlarg(3);
    }
}
