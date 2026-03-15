package lab2;
//p:5
import java.util.Objects;

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getSound();
	
	@Override
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null) return false;
		if(o.getClass()!=this.getClass()) return false;
		
		Animal a = (Animal) o;
		return a.age == this.age && Objects.equals(a.name, this.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
}
