package arrays;

public class SearchInsert {

    public int binarySearch(int []a, int left, int right, int target)
    {
        while(left<=right)
        {
            int middle = (left+right)/2;

            if(a[middle] == target)
            {
                return middle;
            }
            else if(a[middle]>target)
            {
                right = middle -1;
            }
            else
            {
                left = middle + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {

        SearchInsert s = new SearchInsert();
        int []nums = {1,3,5,6};
        int num = nums.length-1;
        int b = 7;

        int r = s.binarySearch(nums, 0, num, b);

            System.out.println("element present at position : "+r);

    }
}
