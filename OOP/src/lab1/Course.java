package lab1;
import java.util.ArrayList;
//problem #4
public class Course {
	private String name = "Undefined";
	private String courseCode = "Undefined";
	private String desc = "No description";
	private int credits = 1;
	private ArrayList<Course> prereqList = new ArrayList<>();
	
	//constructors
	public Course() {}
	
	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, String courseCode) {
		this.name = name;
		this.courseCode = courseCode;
	}
	
	
	public Course(String name, String courseCode, int credits) {
		this.name = name;
		this.courseCode = courseCode;
		this.credits = credits;
	}
	
	
	public Course(String name, String courseCode, String desc, int credits, ArrayList<Course> prereqList) {
		this.name = name;
		this.courseCode = courseCode;
		this.desc = desc;
		this.credits = credits;
		if(!prereqList.isEmpty()) {
			this.prereqList = new ArrayList<>(prereqList);
		}
		else {
			this.prereqList = new ArrayList<>();
		}
	}
	//change List
	public void addPrereq(Course prereq) {
		this.prereqList.add(prereq);
	}
	
	public void removePrereq(Course prereq) {
		this.prereqList.remove(prereq);
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String getDescription() {
		return desc;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public ArrayList<Course> getPrereqList(){
		return new ArrayList<>(prereqList);
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void setPrereqList(ArrayList<Course> prereqList) {
		this.prereqList = new ArrayList<Course>(prereqList);
	}
	
	public String toString() {
		return "Course: "+name+" "+courseCode+" description: "+desc+" "+credits+" credits";
	}
}
