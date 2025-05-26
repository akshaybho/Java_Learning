package arrays;

public class MaxProductArray {

    public static int maxCalculate(int []nums)
    {
        int smax = -1;
        int max = -1;

        for(int i=0; i<nums.length; i++)
        {
            if(max<nums[i])
            {
                smax = max;
                max = nums[i];
            }
            else if(smax<nums[i])
            {
                smax = nums[i];
            }
        }
        int ans = (max-1)*(smax-1);

        return ans;
    }

    public static void main(String[] args) {

        int []a = {4,7,6,5,8,1};
        int b = maxCalculate(a);
        System.out.println(b);
    }
}
