package lab1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import practice2.Student;
//problem #4
public class GradeBook {
	private Course course;
	private ArrayList <Student> studentList = new ArrayList<>();
	private HashMap<Integer, Integer> idAndGrades = new HashMap<>();
	
	private int studentAmount = 0;
	
	private Scanner scan = new Scanner(System.in);
	
	//constructors
	public GradeBook() {}
	
	public GradeBook(Course course) {
		this.course = course;
	}
	
	public GradeBook(Course course, ArrayList<Student> studentList) {
		this.course = course;
		if(!studentList.isEmpty()) {
			this.studentList = new ArrayList<>(studentList);
			this.studentAmount = studentList.size();
		}
	}
	//display message
	private void displayMessage() {
		System.out.printf("Welcome to the grade book for %s %s! ", getCourseCode(), getCourseName());
	}
	
	//insertion methods
	public void insertInfo(Student student, int grade) {
		idAndGrades.put(Integer.valueOf(student.getId()), Integer.valueOf(grade));
	}
	
	public void insertInfo() {
		System.out.println("Please, input grades for students: ");
		for(int i=0;i<studentAmount;i++) {
			System.out.println(studentList.get(i).getName()+" :");
			int grade = scan.nextInt();
			insertInfo(studentList.get(i), grade);
		}
	}
	
	private double calcAverage() {
		if(idAndGrades.isEmpty())return 0;
		
		double sum = 0;
		for(HashMap.Entry<Integer, Integer> entry : idAndGrades.entrySet()) {
			sum+=entry.getValue();
		}
		return sum/studentAmount;
	}

	//getters
	public int getGrade(Student student) {
		return idAndGrades.get(Integer.valueOf(student.getId()));
	}
	
	public String getCourseName() {
		return course.getName();
	}
	
	public String getCourseCode() {
		return course.getCourseCode();
	}
	
	public Student getLowestStudent() {
		if(idAndGrades.isEmpty()) return null;
		Student lowest = Student.getStudentById(1);
		for(HashMap.Entry<Integer, Integer> entry : idAndGrades.entrySet()) {
			if(entry.getValue()<idAndGrades.get(lowest.getId())) {
				lowest = Student.getStudentById(entry.getKey());
			}
		}
		return lowest;
	}
	
	public Student getHighestStudent() {
		if(idAndGrades.isEmpty()) return null;
		Student highest = Student.getStudentById(1);
		for(HashMap.Entry<Integer, Integer> entry : idAndGrades.entrySet()) {
			if(entry.getValue()>idAndGrades.get(highest.getId())) {
				highest = Student.getStudentById(entry.getKey());
			}
		}
		return highest;
	}
	
	private void displayBarChart() {
		System.out.println("Grades distribution: ");
		int[] gradesDistribution = new int[10];
		for (int grade : idAndGrades.values()) {
	        int index = (grade - 1) / 10;
	        if (index > 9) index = 9;
	        gradesDistribution[index]++;
	    }
		
		for(int i=0;i<gradesDistribution.length;i++) {
			int lower = i*10+1;
			int upper = (i==9)?100:(i+1)*10;
			System.out.printf("%d-%d: ",lower, upper);
			for(int j=0;j<gradesDistribution[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void displayGradeReport() {
		displayMessage();
		double gradeAverage = calcAverage();
		System.out.println("Class average: "+gradeAverage);
		Student best = getHighestStudent();
		Student worst = getLowestStudent();
		System.out.println("Lowest grade is "+getGrade(worst)+"("+ worst.getName()+", id: "+ worst.getId() + ").");
		System.out.println("Highest grade is "+getGrade(best)+"("+ best.getName()+", id: "+ best.getId() + ").");
		displayBarChart();
	}
	
	public String toString() {
		return "Gradebook for course: "+getCourseName()+" with "+studentAmount+" students";
	}
}
