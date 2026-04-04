package lab3;
import java.util.Objects;
//#4
public class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "I'm a person and my name is "+name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null ) return false;
		if(o.getClass()!=this.getClass()) return false;
		Person p = (Person) o;
		return p.name.equals(this.name) ;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
