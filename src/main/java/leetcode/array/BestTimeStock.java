package leetcode.array;

public class BestTimeStock {

    public static void main(String[] args) {

        int []arr = {7,1,5,3,6,4};
        int result = maxProfitCalculate(arr);
        System.out.println(result);
    }

    public static int maxProfitCalculate(int []a)
    {
        int minPrice = a[0];
        int profit = 0;

        for(int i=1; i<a.length; i++)
        {
            if(a[i]<minPrice)
            {
                minPrice = a[i];
            }
            else {
                profit = Math.max(profit, a[i]- minPrice);
            }
        }
        return profit;
    }
}
