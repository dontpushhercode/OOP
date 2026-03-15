package lab2;

public class PhDStudent extends Person {
	private String university;
	
	public PhDStudent(String name, int age, String university) {
		super(name, age);
		this.university = university;
	}
	
	@Override
	public String getOccupation() {
		return "This student is studing at: " + university;
	}
	
	@Override
	public void assignPet(Animal pet) {
		if(pet instanceof Dog) {
			System.out.println("Sorry, PhDStudent is to busy");
			return;
		}
		else super.assignPet(pet);
	}

}
