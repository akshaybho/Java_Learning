package tricky;

public class Employee {
    public Employee(double i, String akshay, int year) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompltionYear() {
        return compltionYear;
    }

    public void setCompltionYear(int compltionYear) {
        this.compltionYear = compltionYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
    private String name;
    private int compltionYear;
}
