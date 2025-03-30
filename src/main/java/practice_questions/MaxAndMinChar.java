package practice_questions;

public class MaxAndMinChar {
    public void count(){
        String s = "esterdaa ia watcahed abdaul karaim taelagi saeries";
        char []c = s.toCharArray();
        int []freq = new int[s.length()];

        for(int i=0; i<s.length();i++){

            freq[i] = 1;
            for(int j=i+1;j<s.length();j++) {
                if (c[i] != ' ' && c[i] == c[j] && c[i] != '0') {
                    freq[i]++;

            }
            }
        }
        char minChar = s.charAt(0);
        char maxChar = s.charAt(0);

        int min, max;
        min = freq[0];
        max = freq[0];
        for(int i=0;i<c.length;i++){
            if(min>freq[i]){
                min = freq[i];
                minChar = c[i];
            }
            if(max<freq[i]){
                max = freq[i];
                maxChar = c[i];
            }
        }
        System.out.println("Maximum repeated character is = "+maxChar);
        System.out.println("Minimum charcter is = "+minChar);
    }
    public static void main(String[] args) {
        MaxAndMinChar d = new MaxAndMinChar();
        d.count();
    }
}
