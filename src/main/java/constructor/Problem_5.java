package constructor;

public class Problem_5 {
    private String name;
    private int age;
    private String education;
    private long salary;

    public Problem_5(String name, int age, String education, long salary)
    {
        this.name = name;
        this.age = age;
        this.education = education;
        this.salary = salary;

    }

    public void displayDetails()
    {
        System.out.println("Here is your BioData");
        System.out.println("Boy name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Education : "+education);
        System.out.println("Salary : "+salary);
    }

}
