package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumber_1 {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        int max = myList.stream()
                .max(Comparator.naturalOrder()).get();

        System.out.println(max);
    }
}
