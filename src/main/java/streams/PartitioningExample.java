package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(n->n%2==0)));
    }
}
