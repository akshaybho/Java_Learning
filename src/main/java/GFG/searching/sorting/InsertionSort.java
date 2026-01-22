package GFG.searching.sorting;

public class InsertionSort {

    static int[] insertionSort(int []arr){

        for(int i=0; i<arr.length; i++){

            int j = i;
            while(j>0 && arr[j-1]>arr[j]){

                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int []nums = {7, 5, 9, 2, 8};

        int []result = insertionSort(nums);

        for(int i=0; i<nums.length; i++){

            System.out.print(nums[i]+" ");
        }
    }
}
