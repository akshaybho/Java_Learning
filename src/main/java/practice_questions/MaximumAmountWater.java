package practice_questions;

public class MaximumAmountWater {

    public static int maxArea(int []h)
    {
        int maxArea = 0;
        int left = 0;
        int right = h.length-1;

        while(left<right)
        {
            int b = Math.min(h[left], h[right]);
            int w = right - left;
            int area = b * w;
            maxArea = Math.max(area, maxArea);
            if(h[left]<h[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }


        return maxArea;
    }

    public static void main(String[] args) {

        int []a = {1,8,6,2,5,4,8,3,7};

        int maxAmountWater = maxArea(a);

        System.out.println(maxAmountWater);
    }
}
