package leetcode.array;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {

        int []a = {1, 2, 3, 4};

        int n = a.length;
        int []ans = new int[n];

        Arrays.fill(ans, 1);
        int curr = 1;

        for(int i=1; i<n; i++)
        {
            curr = curr * a[i-1];
            ans[i] = ans[i] * curr;
        } //ans = [1, 1, 1, 1] ---> ans [1, 1, 2, 6]

        int temp = 1;
        for(int i=n-2; i>=0; i--){

            temp = temp * a[i+1];
            ans[i] = ans[i]*temp;
        }

        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
