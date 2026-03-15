package practice4;
//p:1
public class Person implements CanHavePizza {
	private double balance;
	
	public Person() {
		
	}
	
	public Person(double balance) {
		this.balance = balance;
	}
	
	public void pay(double amount) {
		if(!isEnough(amount)) {
			System.out.println("Oops! Insufficient funds");
			return;
		} else {
			this.balance -=amount;
			System.out.println("Payment completed");
		}
	}
	
	public boolean isEnough(double amount) {
		if(this.balance<amount) return false;
		return true;
	}
	
	public void eatPizza() {
		System.out.println("That " + CanHavePizza.PIZZA_SIZE + " cm pizza was delicious!");
	}
}
