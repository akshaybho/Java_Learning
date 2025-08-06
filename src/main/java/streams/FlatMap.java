package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List <List<Integer>> litOfList = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

         List<Integer> newList = litOfList.stream()
                .flatMap(list->list.stream())
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
