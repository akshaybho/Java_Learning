package leetcode.array;

import java.util.Arrays;

public class MergeIntervals {

    public static void main(String[] args) {

        int [][]a = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int [][]b = new int[1][a.length];

        for(int i=1; i<a.length; i++){

            Arrays.sort(a[i]);
            int previousStart = a[i-1][0];
            int previousEnd = a[i-1][1];
            int currentStart = a[i][0];
            int currentEnd = a[i][1];

            int end = Math.max(previousEnd, currentEnd);
            int start = Math.min(previousStart, currentStart);

            if(currentStart <= previousEnd){

                b[0][0] = start;
                b[0][1] = end;
            }
            else {

                b[i][0] = currentStart;
                b[i][1] = currentEnd;
            }
        }
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){

                System.out.print(b[i][j]+" ");
            }
        }
        }
    }

