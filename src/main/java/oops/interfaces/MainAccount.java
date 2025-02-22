package oops.interfaces;

public class MainAccount {

    public static void main(String[] args) {

        Account myAccount = new SavingAccount("Akshay", "7020833038", 1000);

        myAccount.displayAccountInfo();
        myAccount.deposit(1000);
        myAccount.withdraw(500);



        myAccount.displayAccountInfo();
    }
}
