package practice_questions;

public class SeparateEvenOdd {
    public static void main(String[] args) {

        int []a = {45, 12, 127, 56, 89, 11, 123, 100, 45, 78};

        for(int i=0; i<a.length; i++)
        {
            int temp;
          for(int j=i+1; j<a.length; j++)
          {
              if(a[i]%2!=0)
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
        for(int k=0; k<a.length; k++)
        {
            System.out.print(a[k]+" ");
        }

    }
}
