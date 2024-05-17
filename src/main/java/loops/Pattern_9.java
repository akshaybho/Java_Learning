package loops;

public class Pattern_9 {

    public static void main(String[] args) {

        for(int i=4; i>0; i--)
        {

            for(int j=1; j<5; j++)
            {
            if(j==i){
                System.out.print("*"+" ");
                }
            else
            {
                System.out.print(j+" ");

            }
                }
            System.out.println();
            }

        }
    }

