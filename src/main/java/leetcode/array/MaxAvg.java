package leetcode.array;

public class MaxAvg {
    public static void main(String[] args) {
        int[] a = {1,12,-5,-6,50,3};

        int k = 4;
        double maxSum =0;

        double maxAvg;
        for(int i=0; i<k; i++)
        {
            maxSum += a[i];
        }

        double windowSum = maxSum;
        for(int i=k; i<a.length; i++)
        {
            windowSum += a[i] - a[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        maxAvg = maxSum/k;
        System.out.println(maxAvg);
    }
}
