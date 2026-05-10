package leetcode.array;

public class ThirdMaxNumber {

    public static int thirdMaximumNumber(int []nums){

        Integer first = null;
        Integer second = null;
        Integer third = null;

        //We take Integer because we have to add null values if using int default value is 0 the problem should occur further

        for(int num : nums){
             if((first != null && num == first)||
                    (second != null && num == second)||
                    (third != null && num == third)){
                continue;
            }
             if(first == null && num > first){
                 third = second;
                 second = first;
                 first = num;
             } else if (second == null && num > second) {
                 third = second;
                 second = num;
             } else if (third == null && num > third) {
                 third = num;
             }
        }
        return (third == null) ? first : third;
    }

    public static void main(String[] args) {

        int []arr = {2, 2, 3, 1};
        int result = thirdMaximumNumber(arr);
        System.out.println(result);
    }
}
