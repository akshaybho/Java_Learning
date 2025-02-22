package loops;

public class Pattern_12 {

    public static void main(String[] args) {

        for(int i=1; i<6; i++)
        {
            for(int j=0; j<5; j++) {
                System.out.print(((i+j)%2)+" ");
            }
            System.out.println();
        }
    }
}
