package arrays;

public class TraceOfMatrix {

    public static void main(String[] args) {

        int [][]matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        int n = matrix.length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               if(i==j)
               {
                   sum = sum + matrix[i][j];
               }
            }
        }
        System.out.println("Trace of a matrix = "+sum);

    }
}
