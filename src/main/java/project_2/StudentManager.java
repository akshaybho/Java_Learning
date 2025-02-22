package project_2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    // add a new student
    public void addStudent(Student student)
    {
        students.add(student);
        System.out.println("Student added Successfully!");
    }

    //view all students
    public void viewAllStudents()
    {
        if(students.isEmpty())
        {
            System.out.println("No Students found");
        }
        else
        {
            //print all students
            for(Student data : students)
            {
                System.out.println(data);
            }
        }
    }
}
