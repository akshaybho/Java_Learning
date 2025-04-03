package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurencesOfNumber {

    public static void main(String[] args) {

        int []a = {1,2,3,4,1,2,6,9,8,5};

        Map<Integer, Long> freqMap = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()));

        System.out.println("Occurences : "+freqMap);
    }
}
