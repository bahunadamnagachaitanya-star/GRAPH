package CIET;
class BankAccount2{
	private String accountHolder;
	private int accountNumber;
	private double balance;
BankAccount2(String accountHolder,int accountNumber,double balance){
	this.accountHolder=accountHolder;
	this.accountNumber=accountNumber;
	this.balance=balance;
}
void deposit(double amount){
	if(amount>0) {
		balance+=amount;
		System.out.println(amount);
	}
	else {
		System.out.println("invalid amount");
	}
}
 void withdraw (double amount) {
	 if(amount<=0) {
		 System.out.println("invalid withdraw amount");
	 }
	 else if(amount<=balance) {
		 balance-=amount;
		 System.out.println("withdraw successful");
	 }
	 else {
		 System.out.println("insufficient balance");
	 }
	
}
 void displayBalance() {
	 System.out.println("\n----- Account holder details");
	 System.out.println(accountHolder);
	 System.out.println(accountNumber);
	 System.out.println(balance);
 }
	}


public class BankEx {
	public static void main(String[] args) {
		BankAccount2 account=new BankAccount2("chaitanya",123344565,9000);
		account.displayBalance();
		account.deposit(300);
		account.displayBalance();
		account.withdraw(1500);
		account.displayBalance();
		account.withdraw(10000);
		
	}
}
