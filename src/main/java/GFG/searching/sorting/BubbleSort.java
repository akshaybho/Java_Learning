package GFG.searching.sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {

        for(int i=nums.length-1; i>=1; i--){
            for(int j=0; j<i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 2, 8};

        System.out.println("Original Array: ");
        for(int nums : arr){
            System.out.print(nums+" ");
        }
        System.out.println();
        int []sortedOrder = bubbleSort(arr);

        System.out.println("Sorted Array: ");
        for(int data : sortedOrder){
            System.out.print(data+" ");
        }
    }
}
