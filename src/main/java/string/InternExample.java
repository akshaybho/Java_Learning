package string;

public class InternExample {

    public static void main(String[] args) {

        //The intern() method in Java is used to store only one copy of each distinct String value in the String Pool

        String s1 = new String("Hello");
        String s2 = "Hello";

        //without intern()
        System.out.println(s1 == s2);

        //with intern
        String s3 = s1.intern();
        System.out.println(s3 == s2);


    }
}
