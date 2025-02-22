package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaStudent {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("onkar", 29, 26));
        list.add(new Student("akshay", 23, 14));
        list.add(new Student("saloni", 31, 12));

        Collections.sort(list,(p1, p2)-> {
            return p1.name.compareTo(p2.name);
        });

        for(Student s : list)
        {
            System.out.println(s.name+" "+s.id+" "+s.age);
        }


    }
}
