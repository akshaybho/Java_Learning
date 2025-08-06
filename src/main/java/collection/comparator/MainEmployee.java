package collection.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainEmployee {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(127, "Akshay"));
        empList.add(new Employee(34, "Onkar"));
        empList.add(new Employee(24, "Saloni"));

        empList.sort(Comparator.comparing(e->e.empId));

        for(Employee emp : empList)
        {
            emp.displayEmpInfo();
        }


    }
}
