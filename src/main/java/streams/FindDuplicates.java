package streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicates {

    public static void main(String[] args) {

        int []a = {1,2,3,4,1,2,6,9,8,5};

        Set <Integer> seen = new HashSet<>();

        Set <Integer> dupli = (Set<Integer>) IntStream.of(a)
                .boxed()
                .filter(n->!seen.add(n))
                .collect(Collectors.toList());

        System.out.println(dupli);

    }
}
