package practice_questions;

public class ProductArrayExc {

    public static void main(String[] args) {
        int []a = {10, 3, 5, 6, 2};

        int []b = new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            int mul = 1;
            for(int j=0; j<a.length; j++)
            {
                if(i!=j)
                {
                    mul = a[j]*mul;
                    b[i] = mul;
                }
            }
        }
        for(int i=0; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
