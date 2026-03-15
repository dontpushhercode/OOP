package lab2;
//p:5
import java.util.Objects;

public class Student extends Person {
	private double gpa;

	public Student(String name, int age, double gpa) {
		super(name, age);
		this.gpa = gpa;
	}
	
	@Override
	public String getOccupation() {
		return "This student has gpa: " + gpa;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(o.getClass()!=this.getClass()) return false;
		if(!super.equals(o)) return false;
		Student s = (Student) o;
		return gpa == s.gpa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), gpa);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", has gpa: "+gpa+"; ";
	}
}
