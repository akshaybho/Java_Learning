package leetcode.array;

public class SearchInRotated {

    public static void main(String[] args) {

        int []arr = {0, 1, 2, 4, 5, 6, 7};
        int target = 0;
        int result = search(arr, target);
        System.out.println(result);
    }
    public static int search(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){

            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void rotateLeft(int []b, int k){
        int n = b.length;
        k = k%n;

        reverse(b, 0, n-1);
        reverse(b, 0, k);
        reverse(b, k+1, n-1);
    }
    public static void reverse(int []a, int start, int end){

        while(start<end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            start++;
            end--;
        }

    }
}
