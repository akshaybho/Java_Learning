package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CogniStream {

    public static void main(String[] args) {

        String s = "test";  //o/p = es or se

        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Long> entry : map.entrySet()){

            if(entry.getValue()==1){
                sb.append(entry.getKey());
            }
        }
        System.out.println(sb.toString());
    }
}
