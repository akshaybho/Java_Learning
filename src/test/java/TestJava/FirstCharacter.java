package TestJava;

public class FirstCharacter {

    public static void main(String[] args) {

        String s = "Boy is good";
        String[] a = s.split(" ");
        for (int i = 0; i < s.length(); i++) {
            if(i<1) {
                String word_1 = String.valueOf(a[0].charAt(i));
                String word_2 = String.valueOf(a[1].charAt(i));
                String word_3 = String.valueOf(a[2].charAt(i));
                System.out.println(word_1+word_2+word_3);
        }

        }
    }
}
