package lab2;
//p:5
import java.util.Objects;

public class PhDStudent extends Person {
	private String university;
	
	public PhDStudent(String name, int age, String university) {
		super(name, age);
		this.university = university;
	}
	
	@Override
	public String getOccupation() {
		return "This PhD student is studying at: " + university;
	}
	
	@Override
	public void assignPet(Animal pet) {
		if(pet instanceof Dog) {
			System.out.println("Sorry, PhDStudent is too busy");
			return;
		}
		else super.assignPet(pet);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(o.getClass()!=this.getClass()) return false;
		if(!super.equals(o)) return false;
		PhDStudent s = (PhDStudent) o;
		return Objects.equals(university, s.university);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), university);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", studying at: "+university+"; ";
	}
}
