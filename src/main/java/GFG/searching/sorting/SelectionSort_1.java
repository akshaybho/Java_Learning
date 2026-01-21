package GFG.searching.sorting;

public class SelectionSort_1 {

    public static int[] selectionSort(int []arr){

        for(int i=0; i<arr.length-1; i++){

            int minIndex = i;
            for(int j=i; j<arr.length; j++){

                if(arr[j] < arr[minIndex]){

                    minIndex = j;
                }
            }
            //swap only if minIndex changed
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 2, 8};

        System.out.println("Original Array: ");
        for(int nums : arr){
            System.out.print(nums+" ");
        }
        System.out.println();
        int []sortedOrder = selectionSort(arr);

        System.out.println("Sorted Array: ");
        for(int data : sortedOrder){
            System.out.print(data+" ");
        }
    }
}
