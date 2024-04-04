package practice_questions;

public class ShiftZero {

    public static void main(String[] args) {
        int []b = {1,0,2,0,3,0,4,0,5,0};
        shift(b);

    }
    public static void shift(int []a)
    {
        for(int i=0; i<a.length; i++)
        {
            int temp;
            for(int j=i+1; j<=a.length-1; j++)
            {
                if(a[i]!=0)
                {

                }
                else
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
