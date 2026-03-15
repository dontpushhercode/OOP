package practice4;
//p:1
public class Cat extends Animal implements CanHavePizza{
	
	public Cat() {
		super();
	}
	
	public void eatPizza(){
		System.out.println("Meow! That " + CanHavePizza.PIZZA_SIZE + " cm pizza was delicious!");
	}
}
