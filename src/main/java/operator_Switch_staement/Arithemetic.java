package operator_Switch_staement;

public class Arithemetic {

    public static void main(String[] args) {

        int x = 3;
        int y = ++x + x++ + --x;
        System.out.println("x = " + x + ", y = " + y);
        int i = 1;
        System.out.println(i++ + ++i + i++);
       // num1++;   //post increment

        //++num1;   //pre increment

        //int result = ++num1;  // increment and then fetch
        // num1++ : fetch and then increment

       // System.out.println(result);



    }
}
