package practice3;
//problem #2
public class Person {
	private static final String DEF_NAME = "John Doe";
	private static final String DEF_ADDRESS = "Homeless";
	
	protected String name;
	protected String address;
	
	//constructors
	public Person() {
		this(DEF_NAME, DEF_ADDRESS);
	}
	
	public Person(String name) {
		this(name, DEF_ADDRESS);
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//getters
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person[name=" + getName() + ", address=" + getAddress()+"]";
	}
}
