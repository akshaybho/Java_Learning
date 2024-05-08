package practice_questions;

public class ListofPalindrome {
    
    public void listPal() {
        int n = 0;
        for (int i = 10; i < 2000; i++) {
            n = i;

            int h = n;
            int rev = 0;

            while (n > 0) {
                int b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if (h == rev) {

                System.out.print(h + " ");
            } else {

            }
        }
    }
    public static void main(String[] args) {
        ListofPalindrome lp = new ListofPalindrome();
        lp.listPal();
    }
}
