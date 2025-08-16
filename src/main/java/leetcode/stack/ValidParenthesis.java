package leetcode.stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String a = "(){}[](){}";
        boolean status = isValid(a);
        System.out.println(status);
    }

    public static boolean isValid(String s)
    {
        Stack <Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{')
            {
                stack.push(c);
            }
            else if (!stack.isEmpty() && c==')' && stack.peek()=='(') {
                stack.pop();
            }
            else if (!stack.isEmpty() && c==']' && stack.peek()=='[') {
                stack.pop();
            }
            else if (!stack.isEmpty() && c=='}' && stack.peek()=='{') {
                stack.pop();
            }
            else
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
