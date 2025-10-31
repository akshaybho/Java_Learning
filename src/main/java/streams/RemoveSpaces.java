package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSpaces {

    public static void main(String[] args) {

        String []arr = {"akshay", "", "bharat", "saloni"};

        List<String> list = Arrays.stream(arr)
                .filter(n->!n.isEmpty())
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
