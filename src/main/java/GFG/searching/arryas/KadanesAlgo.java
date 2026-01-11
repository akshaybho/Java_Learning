package GFG.searching.arryas;

public class KadanesAlgo {

    public static void main(String[] args) {

        int []a = {2, 3, -8, 7, -1, 2, 3};
        int result = maxSubarraySum(a);
        System.out.println(result);
    }

    static int maxSubarraySum(int[] arr) {
        // Code here
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i=1; i<arr.length; i++){

            currentSum = Math.max(currentSum + arr[i], arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
