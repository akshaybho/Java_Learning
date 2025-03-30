package practice_questions;

public class RemoveOccurences {

    public static void main(String[] args) {

        int []a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;

        for(int i=0; i<a.length; i++)
        {
            if(key!=a[i])
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
