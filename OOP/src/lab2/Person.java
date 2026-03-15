package lab2;

import java.util.Objects;

public abstract class Person {
	private String name;
	private int age;
	private Animal pet;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void assignPet(Animal pet) {
		this.pet = pet;
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		return this.pet!=null;
	}
	
	public abstract String getOccupation();
	
	public String toString() {
		return "Person: " + name + ", age: " + age + ", pet: " + hasPet()?pet.name:" no pet";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null) return false;
		if(o.getClass()!=this.getClass())) return false;
		
		Person p = (Person) o;
		return p.age == this.age && Objects.equals(p.name, this.name) && Objects.equals(o.pet, this.pet);
	}
	
	public int hashCode() {
		return Objects.hash(age, name, pet);
	}
}
