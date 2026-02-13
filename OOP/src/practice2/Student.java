package practice2;
import java.util.HashMap;
//problem #4
public class Student {
	private String name;
	private int yearOfStudy;
	private static int counter = 0;
	private int id;
	
	private static HashMap<Integer, Student> studentList = new HashMap<>();
	
	public Student(){
		this("Unknown", 1);
	}
	
	public Student(String name, int yearOfStudy){
		counter++;
		this.name = name;
		this.yearOfStudy = yearOfStudy;
		this.id = counter;
		studentList.put(Integer.valueOf(id), this);
	}
	
	public String getName(){
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	public void incYearOfStudy() {
		yearOfStudy++;
	}
	
	public static Student getStudentById(int id) {
		return studentList.get(id);
	}
	
	public String toString() {
		return "Student "+this.name+" id: "+this.id+" year of study: "+yearOfStudy;
	}
}
