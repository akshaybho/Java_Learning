package streams.tricky_1;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfEmployees {

     public static List <Employee> employees;
    public static void main(String[] args) {

        employees = new ArrayList<>();
        employees.add(new Employee(101, "Akshay", "IT", 60000));
        employees.add(new Employee(102, "Raj", "HR", 40000));
        employees.add(new Employee(103, "Neha", "IT", 70000));
        employees.add(new Employee(104, "John", "Sales", 50000));
        employees.add(new Employee(105, "Rita", "HR", 45000));

        //name map with id
        mappingEmployeeWithId();

        //filter IT employees
        filterWithDept();

        //group employees by department
        groupByDept();

        //highest salary employee
        highestSalary();

        //getting list of employees with salary>50000 and dept = "IT"
        salaryAndDept();

        //group by and counting
        employeeCountWithDept();
    }

    public static void mappingEmployeeWithId()
    {
        Map<Integer, String> emp = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println("ID -> Name Map : "+emp);
    }

    //Filter the list of employees by "IT" department
    public static void filterWithDept()
    {
        List <Employee> itemp = employees.stream()
                .filter(n -> n.getDepartment().equals("IT"))
                .collect(Collectors.toList());

        System.out.println("IT Employees : "+itemp);
    }

    //group employees by department
    public static void groupByDept()
    {
        Map <String, List<Employee>> deptWiseEmp = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employees grouped by department : "+deptWiseEmp);
    }

    //highest salary employee
    public static void highestSalary() {

        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaid.ifPresent(emp -> System.out.println("Highest Paid : "+emp));
    }
    //getting list of employees with salary>50000 and dept = "IT"
    public static void salaryAndDept()
    {
        List <Employee> filtered = employees.stream()
                .filter(n-> n.getSalary()>50000 && n.getDepartment().equals("IT"))
                .collect(Collectors.toList());

        System.out.println(filtered);
    }

    //group by and counting
    public static void employeeCountWithDept()
    {
        Map <String,Long> mapList = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(mapList);
    }

}
