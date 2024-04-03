package string;

public class lengthOfLastWord {

    public static void main(String[] args) {


        String s = "fly me to the moon";
        s.trim();
        String [] words = s.split(" ");
        String lastWord = words[words.length-1];
        System.out.println(lastWord);
        int length = lastWord.length();
        System.out.println("length of the last word = "+length);
    }
}
