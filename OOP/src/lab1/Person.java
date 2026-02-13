package lab1;
//problem #5
public class Person {
	private Gender gender;
	
	public Person() {
		
	}
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender(){
		return gender;
	}
	
	public String toString() {
		return "a person with gender: "+gender;
	}
}
