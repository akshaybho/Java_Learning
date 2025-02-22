package loops;

public class Pattern_15 {

    public static void main(String[] args) {

        char a = 'E';
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(a+" ");
            }
            System.out.println();
            a--;
        }
    }
}
