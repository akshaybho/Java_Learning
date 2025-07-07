package practice_questions;

public class IQ_1 {

    public static void main(String[] args) {

        String s = "Jay4";
        String number = s.replaceAll("\\D", "");
        System.out.println(number);
        String result = s.replaceAll("[0-9]", "");
        int n = 0;
        try
        {
             n = Integer.parseInt(number);
           
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
        }
        StringBuilder sum = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            sum.append(result);
        }
        System.out.println(sum);
    }
}
