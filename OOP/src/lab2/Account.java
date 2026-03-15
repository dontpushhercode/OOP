package lab2;
//p:3
public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		balance+=sum;
	}
	
	public void withdraw(double sum) {
		if(!isEnough(sum)) {
			System.out.println("Insufficient funds");
			return;
		}
		else {
			balance-=sum;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if(isEnough(amount)) {
			this.withdraw(amount);
			other.deposit(amount);
		}
	}
	
	private boolean isEnough(double amount) {
		if(amount>balance) return false;
		else return true;
	}
	
	@Override
	public String toString() {
		return "Account: " + accNumber + ", balance: " + balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
