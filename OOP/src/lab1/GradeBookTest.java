package lab1;
import java.util.ArrayList;
import practice2.Student;
//problem #4
public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course pp1 = new Course("Programming Principles 1", "CS100", 5);
		ArrayList<Course> oopPrereq= new ArrayList<Course>();
		oopPrereq.add(pp1);
		Course oop = new Course("Object-oriented programming and design", "CS101", "My favourite course", 4, oopPrereq);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		for(int i=0;i<10;i++) {
			Student student = new Student("Student"+(char)(65+i), 2);
			studentList.add(student);
		}
			
		GradeBook gb = new GradeBook(oop, studentList);
		gb.insertInfo();
		gb.displayGradeReport();
	}

}
