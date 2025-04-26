package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmp {

    public static void main(String[] args) {

        List <Employee> list = new ArrayList<>();
        list.add(new Employee("Satish", 55, 45000));
        list.add(new Employee("Mohan", 45, 123000));
        list.add(new Employee("Rajesh", 72,14000));

        Collections.sort(list,(p1,p2)->
        {
            return (int) (p1.salary-p2.salary);
        }
    );
        for(Employee e : list)
        {
            System.out.println("Emp id : "+e.id+" Emp Name : "+e.name+" Emp Salary : "+e.salary);
        }
    }
}
