package leetcode100;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {

        String []a = {"4", "13", "5", "/", "+"};

        int result = evalRPN(a);

        System.out.println(result);
    }

    public static int evalRPN(String []tokens)
    {
        int returnValue = 0;
        String operations = "+-*/";

        Stack <String> stack = new Stack<>();
        for(String t: tokens)
        {
            if(!operations.contains(t))
            {
                stack.push(t);
            }
            else
            {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch(t)
                {
                    case "+": stack.push(String.valueOf(a+b));
                    break;

                    case "-": stack.push(String.valueOf(a-b));
                    break;

                    case "*": stack.push(String.valueOf(a*b));
                    break;

                    case "/": stack.push(String.valueOf(a/b));
                    break;
                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
