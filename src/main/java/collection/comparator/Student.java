package collection.comparator;

public class Student {

    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public void display()
    {
        System.out.println(name+"---->"+marks);
    }
}
