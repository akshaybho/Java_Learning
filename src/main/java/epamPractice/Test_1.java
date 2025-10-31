package epamPractice;

public class Test_1 {

    public static void main(String[] args) {

        int []a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int count = 3;

        for(int i=0; i<a.length; i = i+count)
        {

            int end = Math.min(a.length, i+count);

            System.out.print("[");

            for(int j=i; j<end; j++)
            {
                System.out.print(j);

                if(j<end-1)
                {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
}
