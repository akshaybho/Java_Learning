package PracticeNew;

public class Test  {

   public static void replaceChar(String s)
   {
       String regex = "[^a-zA-Z0-9]";
      String cleanedString = s.replaceAll(regex, "");
       System.out.println(cleanedString);
   }

    public static void main(String[] args) {

       replaceChar("a@ksh#y12");
    }
}


