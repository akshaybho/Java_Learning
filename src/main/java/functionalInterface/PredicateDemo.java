package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<String> n = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        Predicate<String> p = (s) -> s.startsWith("G");

        for(String st : n){

            //call the test method
            if(p.test(st)){
                System.out.println(st);
            }
        }
    }
}
