package practice_questions;

public class RemoveLeading {

   /* public static void main(String[] args) {

        String s = "00000123569";

        int n = Integer.parseInt(s);

        System.out.println(n);
    }*/
   public static String removeZero(String str) {

       StringBuffer sb = new StringBuffer(str);
       int i = 0;
       while (i < str.length() && str.charAt(i) == 0)
           i++;
           sb.replace(0, i, "");
           return sb.toString();
   }

    public static void main(String[] args)
    {
        String s = "0000012303569";
        String result = removeZero(s);
        System.out.println(result);
    }
}

