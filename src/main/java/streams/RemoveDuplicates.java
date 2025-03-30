package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static void main(String[] args) {

       int []a = {1,2,3,4,1,2,6,9,8,5};

       int []uniqueArr = IntStream.of(a).distinct().toArray();

        System.out.println(Arrays.toString(uniqueArr));
    }
}
