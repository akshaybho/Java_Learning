package exception_handling.custom;

public class CustomException_1 {

    public static void main(String[] args) {

        try
        {
            checkAge(15);
        }
        catch(MyCustomException e)
        {
            System.out.println("Caught Exceptiom : "+e.getMessage());
        }
    }

    static void checkAge(int age) throws MyCustomException {
        if(age<18)
        {
            throw new MyCustomException("Age is less tha 18, not allowed!");
        }
        else
        {
            System.out.println("Age is valid, Welcome!");
        }
    }
}
