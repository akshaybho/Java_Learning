package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EvenNum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);

        numbers.stream()
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.print(n+" "));

        System.out.println();
        numbers.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .forEach(n -> System.out.print(n+" "));

        System.out.println();

        Optional <Integer> sum =
        numbers.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce((a,b) -> a+b);

        System.out.println(sum);


    }
}
