package practice_questions;

public class FrequencyWithoutMap {

    public static void main(String[] args) {
        int n = 121325143;
        String s = String.valueOf(n);
        boolean []visited = new boolean[s.length()];

        for(int i=0; i<s.length(); i++)
        {
            if(!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(s.charAt(i) + "===" + count);
            }
        }
    }
}
