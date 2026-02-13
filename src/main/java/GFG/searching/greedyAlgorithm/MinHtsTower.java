package GFG.searching.greedyAlgorithm;

import java.util.Arrays;

public class MinHtsTower {

    public static int getMinDiff(int []arr, int k){

        int n = arr.length;
        Arrays.sort(arr);
        int result = arr[n-1] - arr[0];

        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        int minH, maxH;

        for(int i=0; i<n-1; i++){

            minH = Math.min(smallest, arr[i+1]-k);
            maxH = Math.max(largest, arr[i]+k);

            result = Math.min(result, (maxH-minH));
        }
        return result;
    }

    public static void main(String[] args) {

        int []hts = {2, 4, 3, 9, 9, 10, 9, 7, 1, 2};
        int output = getMinDiff(hts, 4);
        System.out.println(output);
    }
}
