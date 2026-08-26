package leetcode.recursion;

public class ArraySum {

    public static void main(String[] args) {

        int []b = {1, 2, 3};
        int result = arraySum(b);
        System.out.println(result);
    }

    public static int arraySum(int []a){

        return sum(a, 0);
    }
    private static int sum(int []arr, int left){

        // Base case -> left >= arr.length
        if(left >= arr.length){

            return 0;
        }

        return arr[left] + sum(arr, left + 1);
    }
}
