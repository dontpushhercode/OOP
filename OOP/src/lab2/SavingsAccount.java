package lab2;
//p:3
public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(int a, double interest) {
		super(a);
		this.interestRate = interest;
	}
	
	public void addIntereset() {
		double interest = getBalance() * interestRate/100;
		this.deposit(interest);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", interest rate: " + interestRate + "%";
	}
}
