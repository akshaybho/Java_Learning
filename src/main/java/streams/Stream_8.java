package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_8 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11,21,13,15,64,84,75,25,24,16);

              List <String> list =  numbers.stream().
                map(s-> s+"").
                filter(s->s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
