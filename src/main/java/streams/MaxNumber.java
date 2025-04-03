package streams;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int []b = {44,58,65,12,65,72,95,63,67};

        int max = Arrays.stream(b).max().orElseThrow(()->new RuntimeException("Arrayi s empty"));

        System.out.println(max);

    }
}
