package practice4;
//p:1
public class Restaurant {
	
	private double pizzaPrice;
	
	public Restaurant(double pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	public void servePizza(CanHavePizza eater) {
		if(eater instanceof Person) {
			if(((Person)eater).isEnough(pizzaPrice)) {
				((Person) eater).pay(pizzaPrice);
			}
		}
		eater.eatPizza();
	}
}
