package lab2;
//p:3
public class CheckingAccount extends Account {
	
	private int numberOfTransactions;
	private static final int FREE_TRANSACTIONS = 3;
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	@Override
	public void withdraw(double sum) {
		super.withdraw(sum);
		numberOfTransactions++;
	}
	
	@Override
	public void deposit(double sum) {
		super.deposit(sum);
		numberOfTransactions++;
	}
	
	public void deductFee() {
		if(numberOfTransactions> FREE_TRANSACTIONS) {
			double fee = (numberOfTransactions - FREE_TRANSACTIONS) * 0.02;
			super.withdraw(fee);
		}
		numberOfTransactions = 0;
	}
	
	@Override
	public String toString() {
		return super.toString()+", number of transactions: " + numberOfTransactions;
	}
}
