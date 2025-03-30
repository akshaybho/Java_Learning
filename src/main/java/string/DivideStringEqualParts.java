package string;

public class DivideStringEqualParts {

    public static void divideParts(String s, int n)
    {
        //aaabbbccc
        String []words = new String[n];
        int chars = s.length()/n;
        int count = 0;

        for(int i=0; i<s.length(); i = i+chars)
        {
            String part = s.substring(i, i+chars);
            words[count] = part;
            count++;
        }
        for(int j=0; j<words.length; j++)
        {
            System.out.println(words[j]);
        }
    }
    public static void main(String[] args) {

        divideParts("aabbbcccdddd", 3);
    }
}
