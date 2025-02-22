package innerclass;

public class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.display();
    }
}
