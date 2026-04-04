package lab3;
//#2
public class Car implements Drivable{
	private String model;
	private int year;
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		
	}
	
	public void move() {
		System.out.println("The car is moving");
	}
	
	public void drive() {
		System.out.println("Someone is driving the car");
	}
}
