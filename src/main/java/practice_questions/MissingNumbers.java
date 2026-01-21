package practice_questions;

public class MissingNumbers {
    public static void main(String[] args) {
        int []b = {8, 2, 4, 5, 3, 7, 1};
        int result =  missingNumber(b);
        System.out.println(result);

    }

    public static int missingNumber(int []arr){


        long n = arr.length+1;
        long sum = 0;
        for(int i=0; i<arr.length; i++){

           sum += arr[i];
        }

        long expSum = n*(n+1)/2;

        return (int)(expSum-sum);
    }
}
