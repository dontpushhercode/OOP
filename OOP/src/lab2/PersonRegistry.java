package lab2;
//p:5
import java.util.Vector;

public class PersonRegistry {
	private Vector<Person> persons = new Vector<Person>();
	
	public PersonRegistry() {	
		
	}
	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	public void removePerson(Person p) {
		persons.remove(p);
	}
	
	public Vector<Person> peopleWithPets() {
		return filtered(true);
	}
	
	public Vector<Person> peopleWithoutPets() {
		return filtered(false);
	}
	
	private Vector<Person> filtered(boolean filter){
		Vector<Person> result = new Vector<Person>();
		for(Person p:persons) {
			if(p.hasPet() == filter) result.add(p);
		}
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(Person p:persons) {
			result+=p.toString();
		}
		return result;
	}
}
