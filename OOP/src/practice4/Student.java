package practice4;
//p:1
public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable {
	
	public Student(double balance) {
		super(balance);
	}
	
	@Override
	public void move() {
		System.out.println("Student is moving");
	}
	
	@Override
	public void dance() {
		System.out.println("Student is dancing");
	}
	
	@Override
	public void payRetake(double amount) {
		if(isEnough(amount)) this.pay(amount);
		else System.out.println("This student is too broke :(");
	}
	
	@Override
	public void eatPizza() {
		System.out.println("That " + CanHavePizza.PIZZA_SIZE + " cm pizza was delicious! Unfortunately, I missed the deadline.");
	}
}
