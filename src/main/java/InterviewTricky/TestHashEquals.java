package InterviewTricky;

import java.util.HashSet;
import java.util.Objects;

class Employee{

     private int id;
     private String name;

     public Employee(int id, String name)
     {
         this.id = id;
         this.name = name;
     }

     //override equals method
     @Override
     public boolean equals(Object obj)
     {
         // If same reference, return true
         if(this == obj)
         {
             return true;
         }
         //If obj is null or not same class, return false
         if(obj == null || getClass() != obj.getClass())
         {
             return false;
         }

         //Typecase the compare fields
         Employee other = (Employee)obj;

         return id == other.id && Objects.equals(name, other.name);
     }

     //override hashcode
    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }

    @Override
    public String toString()
    {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
public class TestHashEquals {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Akshay");
        Employee e2 = new Employee(1, "Akshay");
        Employee e3 = new Employee(2, "Rahul");
        Employee e4 = new Employee(3, "Ashish");

        System.out.println(e1.equals(e2)); // true
        System.out.println(e1.hashCode() == e2.hashCode()); // true

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        System.out.println(set); // Only one object stored
    }
}
