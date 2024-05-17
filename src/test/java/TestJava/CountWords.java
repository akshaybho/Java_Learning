package TestJava;

public class CountWords {

    public static void main(String[] args) {

        String s = "my name is akshay bhogale";
        int count =1;
        for(int i=0; i<s.length()-1; i++)
        {
            char c = s.charAt(i);
            char d = s.charAt(i+1);
            if(c==' ' && d!=' ')
            {
                count++;
            }
        }
        System.out.println("The number of word are = "+count);
    }
}
