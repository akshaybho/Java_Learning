package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortMatrixCol {

    public static void main(String[] args) {

        int [][]matrix = {
                {39,27,11,42},
                {10,93,91,90},
                {54,78,56,89},
                {24,64,20,65}
        };

        Arrays.sort(matrix, Comparator.comparingInt(row -> row[2]));

        for(int []a : matrix)
        {
            for(int value : a)
                System.out.print(value+" ");
            System.out.println();
        }

    }
}
