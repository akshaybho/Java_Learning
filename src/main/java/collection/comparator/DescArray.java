package collection.comparator;

import java.util.Arrays;
import java.util.List;

public class DescArray {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 1, 8, 3);

        list.sort((a, b) -> b - a);

        System.out.println(list);
    }
}
