package practice_questions;

public class SumFilterArray {

    public static void main(String[] args) {
        int []a = {1, 2, 3, 0, 5};
        int temp;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                temp = a[i]+a[j];
                if(temp==3)
                {
                    System.out.print(a[i]+","+a[j]+" ");
                }
            }
        }
    }


}
