package JDBC.statiicBlockInit;

public class Main {

    public static void main(String[] args) {

        StaticDemo.getValue();
        StaticDemo.getValue();// output give only one time (only one object is created)
    }
}
