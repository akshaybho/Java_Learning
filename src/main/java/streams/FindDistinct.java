package streams;

import java.util.Arrays;

public class FindDistinct {

    public static void main(String[] args) {

        int []a = {1,2,3,4,1,2,6,9,8,5};

        int []unique = Arrays.stream(a).distinct().toArray();

        System.out.println(Arrays.toString(unique));

    }
}
