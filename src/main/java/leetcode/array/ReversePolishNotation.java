package leetcode.array;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {

        String []a = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

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
                    case "+": stack.push(String.valueOf(b+a));
                    break;

                    case "-": stack.push(String.valueOf(b-a));
                    break;

                    case "*": stack.push(String.valueOf(b*a));
                    break;

                    case "/": stack.push(String.valueOf(b/a));
                    break;
                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
