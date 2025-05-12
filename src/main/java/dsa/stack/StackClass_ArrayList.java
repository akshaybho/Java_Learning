package dsa.stack;

import java.util.ArrayList;

public class StackClass_ArrayList {


    static class Stack
    {
        static ArrayList <Integer> list = new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.isEmpty();
        }

        //push
        public static void push(int data)
        {
           list.add(data);
        }
        //pop
        public static void pop()
        {
            if(isEmpty())
            {
                return;
            }

            list.remove(list.size()-1);
        }
        //peek
        public static int peek()
        {
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {

       Stack.push(1);
       Stack.push(2);
       Stack.push(3);
       Stack.push(4);

       while(!Stack.isEmpty())
       {
           System.out.println(Stack.peek());
           Stack.pop();
       }

    }
}
