package leetcode.slidingwindow;

public class SubArraySum {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 7, 5};
        int target = 12;
        subArraySum(arr, target);
    }

    public static void subArraySum(int []a, int target)
    {
        int start = 0;
        int current_sum = 0;

        for(int end = 0; end < a.length; end++){

            current_sum += a[end];

            while(current_sum > target && start < end)
            {
                current_sum -= a[start];
                start++;
            }

            if(current_sum == target)
            {
                for(int i = start; i <= end; i++)
                {
                    //System.out.print(a[i]+" ");
                    System.out.print(start+1+" ");
                    System.out.print(end+1);
                    break;
                }
                return;
            }

    }
        System.out.println("Subarray not found");

    }
}
