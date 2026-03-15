package lab2;
//p:3
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank kaspi = new Bank();
		
		Account a = new Account(1);
		SavingsAccount sa = new SavingsAccount(2, 5);
		CheckingAccount ca = new CheckingAccount(3);
		
		sa.deposit(100);
		System.out.println(sa.getBalance());
		sa.addIntereset();
		System.out.println(sa.getBalance());
		
		ca.deposit(10);
		ca.deposit(100);
		ca.withdraw(15);
		ca.transfer(15, a);
		System.out.println(ca.getBalance());
		ca.deductFee();
		System.out.println(ca.getBalance());
		
		kaspi.openAccount(a);
		kaspi.openAccount(sa);
		kaspi.openAccount(ca);
		
		kaspi.udpate();
		System.out.println(sa.getBalance());
	}

}
