package TestJava;

public class Simple {
    public static void main(String[] args) {

        int []a = {1, 0, -2, 0, 3, 0, 4, 0, 5, 0};

        for(int i=0; i<a.length; i++)
        {
            int temp;
            for(int j=i+1; j<a.length-1; j++)
            {
                if(a[j]!=0)
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
