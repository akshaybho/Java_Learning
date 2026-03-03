package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static List<Integer> getRow(int rowIndex){

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(rowIndex == 0) return result.get(0);

        for(int i=1; i<=rowIndex; i++){

            List<Integer> prevRow = result.get(i-1);

            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0; j<i-1; j++){
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1);

            result.add(row);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args) {

        List <Integer> out = getRow(3);
        System.out.println(out);
    }
}
