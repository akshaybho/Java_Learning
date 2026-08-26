package leetcode.recursion;

import java.util.ArrayList;

public class ReverseStringsArray {

    public static void main(String[] args) {

        ArrayList<Character> res = new ArrayList<>();
        res.add('h');
        res.add('e');
        res.add('l');
        res.add('l');
        res.add('o');

        reverseString(res);
        System.out.println(res);
    }
    public static void reverse(ArrayList<Character>s, int left, int right){

        if(left >= right) return;

        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverse(s, left+1, right-1);
    }
    public static ArrayList<Character> reverseString(ArrayList<Character> s){
        int left = 0;
        int right = s.size()-1;
        reverse(s, left, right);
        return s;
    }
}
