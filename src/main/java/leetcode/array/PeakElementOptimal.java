package leetcode.array;

public class PeakElementOptimal {

    public static void main(String[] args) {

        int []arr = {1,2,1,3,5,6,4};

        for(int i=1; i< arr.length; i++){

            int left = i-1;
            int right = i+1;
            if(arr[i] > arr[left] && arr[i] > arr[right]){
                System.out.println(i);
            }
        }

    }
}
