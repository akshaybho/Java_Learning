package generics;

public class Test {

    public static void main(String[] args) {

        Box <Integer> number = new Box<>(123);
        System.out.println(number.getValue());

        Box <String> letters = new Box<>("abc");
        System.out.println(letters.getValue());
    }
}
