package collection.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainStudent {

    public static void main(String[] args) {

        List<Student> std = new ArrayList<>();
        std.add(new Student("Akshay", 65));
        std.add(new Student("Saloni", 95));
        std.add(new Student("Alex", 56));


        std.sort(Comparator.comparingInt(s -> s.marks));

        for(Student b : std)
        {
            b.display();
        }
    }
}
