package CIET;
class BankAccount {
	private double balance;
	double getBalance() {
		return balance ;
	}
	public void deposit(double amount) {
		if(amount>0)
			balance+=amount;
		else 
			System.out.println("invalid account");
	}	
}
public class Bank {
	public static void main(String[] args) {
	BankAccount account= new BankAccount();
	account.deposit(40000);
	System.out.println(account.getBalance());
	} 
}
