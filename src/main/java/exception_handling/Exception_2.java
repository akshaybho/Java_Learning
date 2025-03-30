package exception_handling;

public class Exception_2 {

    public static void main(String[] args) {

        try
        {
            int a = 10, b = 0;
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e.getMessage());
        }
        finally
        {
            System.out.println("This block always executes");
        }
    }
}
