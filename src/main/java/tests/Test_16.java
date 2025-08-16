package tests;

public class Test_16 {
    public static void main(String[] args) {


        int[] a = {5};

        int k = 1;
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