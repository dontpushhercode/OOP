package lab3;
//#6
import java.util.Objects;

public abstract class Animal implements Comparable<Animal>, Cloneable, Playable{
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
	
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public int compareTo(Animal a) {
		return Integer.compare(this.age, a.age);
	}
	
	@Override
	public void play() {
		System.out.println("The animal is playing");
	}
	
	@Override
	public Animal clone() {
		try {
			return (Animal) super.clone();	
		}
		catch (Exception e){
			throw new AssertionError();
		}
	}
}
