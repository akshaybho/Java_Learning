package streams;

import java.util.ArrayList;
import java.util.Collections;

public class Stream_1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("abhijeet");
        names.add("don");
        names.add("ajinkya");
        names.add("boss");
        names.add("akshay");

        Long c = names.stream().filter(s->s.startsWith("a")).count();
        System.out.println(c);

        Collections.sort(names);
        System.out.println(names);

       for(String data : names)
       {
           if(data.length()>4)
           {
               System.out.println(data);
           }
       }



    }
}
