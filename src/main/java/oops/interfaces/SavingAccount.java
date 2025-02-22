package oops.interfaces;

public class SavingAccount implements Account{

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public SavingAccount(String accountHolderName, String accountNumber, double balance)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0)
        {
            balance = amount + balance;
            System.out.println("Deposit Successful. new Balance : "+balance);
        }
        else
        {
            System.out.println("Deposit amount must be greater than zero");
        }
    }
    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount<=balance)
        {
            balance = balance - amount;
            System.out.println("Withdraw Successful. new Balance : "+balance);
        }
        else if(amount>0)
        {
            System.out.println("Insufficient Balance.");
        }
        else
        {
            System.out.println("Withdraw amount must be greater than zero");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void displayAccountInfo() {
        System.out.println("Saving account details");
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("account Number: "+accountNumber);
        System.out.println("Current Balance: "+balance);
    }
}
