package keywords;

public class Super_2_2 extends Super_2{

    private int id;

    public Super_2_2(String name, int age, int id)
    {
        super(name, age);
        this.id = id;
    }

    public void display()
    {
        System.out.println(name+" "+age+" "+id);
    }
}
