package practice4;
//p:1
public class PizzaParty {

	public static void main(String[] args) {
		CanHavePizza eater = new Cat();
		Animal eater2 = new Cat();
		Person eater3 = new Person(70.0);
		
		Restaurant dodoPizza = new Restaurant(30);
	
		eater.eatPizza();
		
		dodoPizza.servePizza(eater);
		dodoPizza.servePizza(eater3);
	}

}
