package keywords;

public class Super_1_1 extends Super_1 {

    String breed;

    Super_1_1(String name, String breed)
    {
        super(name);
        this.breed = breed;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Breed :"+breed);
    }
    void bark()
    {
        System.out.println(name + " is barking");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Dog food is delicious");
    }

    public static void main(String[] args) {
        Super_1_1 s = new Super_1_1("Buddy", "Labrador");
        s.display();
        s.bark();
        s.eat();
    }
}
