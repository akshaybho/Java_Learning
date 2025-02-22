package string;

public class SeparaetNumberString {
    static void separeteNumber(String s)
    {
        StringBuilder number = new StringBuilder();
        StringBuilder letter = new StringBuilder();

        for(Character c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                number.append(c);
            }
            else
            {
                letter.append(c);
            }
        }
        System.out.println("Number : "+number);
        System.out.println("Letters : "+letter);
    }

    public static void main(String[] args) {
        separeteNumber("Welcome123");
    }
}
