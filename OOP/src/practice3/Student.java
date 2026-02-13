package practice3;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	//constructors
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	//getters
	public String getProgram() {
		return program;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getFee() {
		return fee;
	}
	
	//setters
	public void setProgram(String program) {
		this.program = program;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Student["+super.toString()+", program="+getProgram()+", year="+getYear()+", fee="+getFee()+"]";
	}
}
