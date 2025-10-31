package practice_questions;

import java.util.ArrayList;
import java.util.List;

public class incedo_2 {

    public static void main(String[] args) {

        int []input = {9};

        StringBuilder sb = new StringBuilder();

        for(int n : input)
        {
            sb.append(String.valueOf(n));
        }

        int number = Integer.parseInt(sb.toString());

        int sum = number + 1;

       String word =  String.valueOf(sum);

       List<Character> list = new ArrayList<>();

       for(char d : word.toCharArray())
       {
           list.add(d);
       }

        System.out.println(list);
    }
}
