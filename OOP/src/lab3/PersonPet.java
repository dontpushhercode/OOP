package lab3;
//#6
import java.util.Objects;

public abstract class PersonPet implements Moveable, Comparable<PersonPet>{
	private String name;
	private int age;
	private Animal pet;
	
	public PersonPet() {
		
	}
	
	public PersonPet(String name, int age) {
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
	
	public void move() {
		System.out.println("The person is moving");
	}
	
	public void leavePetWith(PersonPet p) {
		if(p.hasPet()) {
			System.out.println("Sorry! This person already has a pet");
			return;
		}
		if(!hasPet()) {
			System.out.println(name + " doesn't have a pet");
			return;
		}
//		if(p instanceof PhDStudent && pet instanceof Dog) {
//			System.out.println("Sorry, PhDStudent is too busy");
//			return;
//		}
		p.assignPet(pet);
		this.removePet();
	}
	
	public void retrievePetFrom(PersonPet p) {
		if(!p.hasPet()) {
			System.out.println(p.name + " doesn't have a pet");
			return;
		}
		if(hasPet()) {
			System.out.println("Sorry! This person already has a pet");
			return;
		}
//		if(this instanceof PhDStudent && p.pet instanceof Dog) {
//			System.out.println("Sorry, PhDStudent is too busy");
//			return;
//		}
		this.assignPet(p.pet);
		p.removePet();
	}
	
	public abstract String getOccupation();
	
	@Override
	public String toString() {
		return "Person: " + name + ", age: " + age + ", pet: " + (hasPet()?pet.getName():"no pet");
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null) return false;
		if(o.getClass()!=this.getClass()) return false;
		
		PersonPet p = (PersonPet) o;
		return p.age == this.age && Objects.equals(p.name, this.name) && Objects.equals(p.pet, this.pet);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, pet);
	}
	
	@Override
	public int compareTo(PersonPet p) {
		return Integer.compare(this.age, p.age);
	}
}
