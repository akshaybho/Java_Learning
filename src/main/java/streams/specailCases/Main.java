package streams.specailCases;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("A", 2021, 50000),
                new Employee("B", 2021, 70000),
                new Employee("C", 2022, 60000),
                new Employee("D", 2022, 90000),
                new Employee("E", 2023, 80000)
        );

        // Group by year and sum salaries
        Map<Integer, Double> salaryByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee :: getYear,
                        Collectors.summingDouble(Employee::getSalary)
                ));

        System.out.println(salaryByYear);

        // Sort by salary sum in decreasing order and print
        salaryByYear.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.println("Year: "+entry.getKey()+" -> Total salary: "+entry.getValue()));
    }
}
