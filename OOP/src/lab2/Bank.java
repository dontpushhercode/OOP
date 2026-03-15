package lab2;
//p:3
import java.util.Vector;

public class Bank {
	private Vector<Account> accounts = new Vector<Account>();
	
	public void openAccount(Account acc) {
		accounts.add(acc);
	}
	
	public void closeAccount(int accNumber) {
	    for(Account a : accounts) {
	        if(a.getAccountNumber() == accNumber) {
	            accounts.remove(a);
	            break;
	        }
	    }
	}
	
	public void udpate() {
		for(Account a:accounts) {
			if(a instanceof SavingsAccount) {
				SavingsAccount sa = (SavingsAccount) a;
				sa.addIntereset();
			}
			if(a instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount) a;
				ca.deductFee();
			}
		}
	}
}
