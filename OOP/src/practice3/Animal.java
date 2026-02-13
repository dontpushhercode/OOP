package practice3;
//problem #1
public class Animal {
	protected static final String DEF_NAME = "No name";
	protected static final int DEF_AGE = 0;
	
	protected String name;
	protected int age;
	
	//constructors
	public Animal() {
		this(DEF_NAME, DEF_AGE);
	}
	
	public Animal(String name) {
		this(name, DEF_AGE);
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//methods
	public void run() {
		System.out.println("Animal is running");
	}
}
