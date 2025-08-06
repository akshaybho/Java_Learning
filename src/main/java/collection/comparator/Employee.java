package collection.comparator;

public class Employee {

     int empId;
     String empName;

    public Employee(int empId, String empName)
    {
        this.empId = empId;
        this.empName = empName;
    }


    public void displayEmpInfo()
    {
        System.out.println(empId+"----->"+empName);
    }
}
