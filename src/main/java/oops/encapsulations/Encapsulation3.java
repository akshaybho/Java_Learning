package oops.encapsulations;



public class Encapsulation3 {
	
	private int accountNumber;
	private String accountHolderNAme;
	private int balance;
	public Encapsulation3(int accountNumber, String accountHolderNAme, int balance) {

		this.accountNumber = accountNumber;
		this.accountHolderNAme = accountHolderNAme;
		this.balance = balance;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHolderNAme() {
		return accountHolderNAme;
	}


	public void setAccountHolderNAme(String accountHolderNAme) {
		this.accountHolderNAme = accountHolderNAme;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void withdraw(int amount) {
		if(amount>0) {
		if(amount<=balance) {
			balance = balance - amount;
			System.out.println("Withdrawal of Amount "+amount+" Successfull");
			System.out.println("Your new balance is = "+balance);
		}
		}
		
	}

	public static void main(String[] args) {
         Encapsulation3 f = new Encapsulation3(1002,"Akshay",100000);
        
         System.out.println(f.getAccountNumber());
         System.out.println(f.getAccountHolderNAme());
         System.out.println(f.getBalance());
         System.out.println("------------------------------------------------");
         
         f.withdraw(10000);
	}
      
	

}
