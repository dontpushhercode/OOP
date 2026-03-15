package lab2;
//p:5
public class Bird extends Animal {
	
	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public String getSound() {
		return "Pew pew pew";
	}

}
