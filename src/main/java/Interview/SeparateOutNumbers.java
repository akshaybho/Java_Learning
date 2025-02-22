package Interview;

public class SeparateOutNumbers {

    public static void main(String[] args) {

        String s = "Samuel has 3 dogs and he goes to walk with them at 5 in the morning";

        String[] words = s.split("\\s+");

        for(String data : words)
        {
            try
            {
                int num = Integer.parseInt(data);
                System.out.println(num);
            }
            catch(NumberFormatException e)
            {

            }
        }
    }
}
