package mathfuctions;

public class Math_3 {

    //Formula for generate random number between specified range
    //Math.random()*(max-min+1)+min
    public static void main(String[] args) {
        int min = 200;
        int max = 400;
        System.out.println("random value between "+min+" to "+max);

        double a = Math.random()*(max - min +1)+min;
        System.out.println(a);
    }
}
