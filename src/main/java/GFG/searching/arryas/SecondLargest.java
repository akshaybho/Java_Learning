package GFG.searching.arryas;

public class SecondLargest {

    public static int getSecondLargest(int []arr)
    {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // finding the second largest element
        for (int i = 0; i < n; i++) {

            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            // If arr[i] < largest and arr[i] > second largest,
            // update second largest with arr[i]
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int []a = {5, 6, 88, 2, 36, 95};
        int result = getSecondLargest(a);
        System.out.println(result);
    }
}
