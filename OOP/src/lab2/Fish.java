package lab2;
//p:5
public class Fish extends Animal {
	
	public Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public String getSound() {
		return "Look at these delicious worms!";
	}

}
