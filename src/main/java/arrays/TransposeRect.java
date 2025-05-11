package arrays;

public class TransposeRect {

    public static void main(String[] args) {

        int [][]matrix = {
                {1,2,3},
                {4,5,6}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        int [][]transpose = new int[col][row];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               transpose[j][i] = matrix[i][j];
            }
        }
        for(int []a : transpose)
        {
            for(int value : a)
                System.out.print(value + " ");
            System.out.println();
        }


        }
    }

