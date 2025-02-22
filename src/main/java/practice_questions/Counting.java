package practice_questions;



import java.util.ArrayList;
import java.util.List;

public class Counting {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("cccccccc");
        names.add("aaa");
        names.add("bbbbb");
        names.add("ddddddddddddd");
        for(String n : names){
            System.out.println(n+"= "+n.length());
        }
        System.out.println(names);

    }
}
