package practice_questions;

public class String_4 {

    String str = "Samuel has 3 dogs and he goes to walk with them at 5 in the morning";
    public void seaparateNumber(){
        String []words = str.split("\\s+");
        for(String word : words){
           try {
               int num = Integer.parseInt(word);
               System.out.println(num+" ");
           }
           catch(NumberFormatException e){

           }
        }
    }

    public static void main(String[] args) {
        String_4 d = new String_4();
        d.seaparateNumber();
    }
}
