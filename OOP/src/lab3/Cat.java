package lab3;
//#1
public class Cat implements Playable {
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Cat() {
		
	}
	
	public void play() {
		System.out.println("Meow! I really like being played with!");
	}
}
