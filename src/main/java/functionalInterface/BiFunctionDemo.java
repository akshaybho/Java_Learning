package functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {

        //BiFunction : The BiFunction Interface is a part of the java.util.function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function which takes in two arguments and produces a result. Hence this functional interface which takes in 3 parameters namely:-
        //
        //T: denotes the type of the first argument to the function
        //U: denotes the type of the second argument to the function
        //R: denotes the return type of the function

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum = "+add.apply(2, 3));

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        System.out.println("Multiplication = "+multiply.apply(3, 6));

        //compoiste function : andThen()
        multiply = multiply.andThen(d -> 2 + d);

        System.out.println("Composite multiply ans = "+multiply.apply(4, 5));
    }
}
