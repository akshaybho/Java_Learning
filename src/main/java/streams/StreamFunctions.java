package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctions {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        int number = myList.stream()
                .findFirst()
                .get();
        System.out.println(number);

        //total number of elements
        int totalNumbers = Math.toIntExact(myList.stream()
                .count());
        System.out.println(totalNumbers);

        //count distinct Integers
        int totalDistinct = Math.toIntExact(myList.stream().distinct().count());
        System.out.println(totalDistinct);

        //Ascending array
        List <Integer> asc = myList.stream()
                .sorted((a, b)->(b.compareTo(a)))
                .collect(Collectors.toList());

        System.out.println(asc);
        
    }
}
