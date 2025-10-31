package streams.tricky_1;

import java.util.*;
import java.util.stream.Collectors;

public class  ListOfEmployees {

     public static List <Employee> employees;
    public static void main(String[] args) {

        employees = new ArrayList<>();
        employees.add(new Employee(101, "Akshay", "IT", 60000));
        employees.add(new Employee(102, "Raj", "HR", 40000));
        employees.add(new Employee(103, "Neha", "IT", 70000));
        employees.add(new Employee(104, "John", "Sales", 50000));
        employees.add(new Employee(105, "Rita", "HR", 45000));

        // 1. name map with id
        mappingEmployeeWithId();

        // 2. filter IT employees
        filterWithDept();

        // 3. group employees by department
        groupByDept();

        // 4. highest salary employee
        highestSalary();

        // 5. getting list of employees with salary>50000 and dept = "IT"
        salaryAndDept();

        // 6. group by and counting
        employeeCountWithDept();

        // 7. names have salary more than 50000
        employeeSalaryNames();

        // 8. sort the employees by salary in descending order
        List <String> names = descendingBySalary();
        System.out.println(names);

        // 9. highest salaried IT employee
        highestSalaryInIT();

        // 10. average salary of HR department
        double averageSalary = avgSalary();
        System.out.println(averageSalary);

        // 11. sum of IT employees salary
        double sumSalary = sumOfITSalary();
        System.out.println(sumSalary);
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

    //list the names of employees whos salary more than 50000

   public static void employeeSalaryNames()
   {
      List <String> names = employees.stream().filter(n->n.getSalary()>50000)
              .map(Employee::getName)
              .collect(Collectors.toList());

       System.out.println(names);
   }

   //sort the employees by salary in descending order

    public static List<String> descendingBySalary()
    {
        return employees.stream()
                .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    //highest salary in IT department
    public static void highestSalaryInIT()
    {
       Optional <Employee> highestIT = employees.stream()
               .filter(n->n.getDepartment().equals("IT"))
               .max(Comparator.comparingDouble(Employee::getSalary));

       highestIT.ifPresent(System.out::println);
    }

    //average salary in HR department
    public static double avgSalary()
    {
        return employees.stream()
                .filter(n-> n.getDepartment().equals("HR"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    //sum of IT employees salary
    public static double sumOfITSalary()
    {
        return employees.stream()
                .filter(n->n.getDepartment().equals("IT"))
                .mapToDouble(Employee::getSalary)
                .sum();
    }

}
