package arrays;

public class TransposeSquare {

    public static void main(String[] args) {

        int [][]matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;

        for(int i=0; i<n; i++)
        {
            for(int j = i+1; j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for( int []row : matrix)
        {
            for(int value : row)
            {
                System.out.print(value+" ");

            }
            System.out.println();
        }
    }
}
