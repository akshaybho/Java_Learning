package leetcode.bitManipulations;

public class BinaryToDecimal {

    public static void main(String[] args) {

        String binary = "1101";

        int power = 0, decimal = 0;

        for(int i=binary.length()-1; i>=0; i--){

            int digits = binary.charAt(i) - '0';

            decimal += digits * Math.pow(2, power);
            
            power++;
        }

        System.out.println(decimal);
    }
}
