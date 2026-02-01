package practice2;

class Student {
	private String name;
	private int yearOfStudy;
	private static int counter = 0;
	private int id;
	
	Student(){
		this("Unknown", 1);
	}
	
	Student(String name, int yearOfStudy){
		counter++;
		this.name = name;
		this.yearOfStudy = yearOfStudy;
		id = counter;
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
}
