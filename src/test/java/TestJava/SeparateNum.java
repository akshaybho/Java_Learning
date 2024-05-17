package TestJava;

public class SeparateNum {

    public static void main(String[] args) {

        String a = "Samuel has 3 dogs and he goes to walk with them at 5 in the morning";

        String []words = a.split("\\s+");
        for(String word : words)
        {
            try {
                int n = Integer.parseInt(word);
                System.out.println(word);

            }
            catch(NumberFormatException e)
            {

            }
        }
    }
}
