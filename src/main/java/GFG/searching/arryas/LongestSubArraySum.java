package GFG.searching.arryas;

public class LongestSubArraySum {

    public static void main(String[] args) {

        int []a = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int res = 0;

        for(int i=0; i<a.length; i++){

            int sum = 0;
            for(int j=i; j<a.length; j++){

                sum += a[j];

                if(sum == k){

                    int subLen = j-i+1;
                    res = Math.max(subLen, res);
                }
            }
        }
        System.out.println(res);
    }
}
