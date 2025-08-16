package streams;

import java.util.Arrays;
import java.util.List;

public class Parallel {

    public static void main(String[] args) {

        List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

         numbers.parallelStream()
                .forEach(num -> System.out.println(Thread.currentThread().getName()+"===="+num));

        System.out.println("==========================================================================");

         numbers.stream()
                 .forEach(num-> System.out.println(Thread.currentThread().getName()+"==="+num));

    }
}
