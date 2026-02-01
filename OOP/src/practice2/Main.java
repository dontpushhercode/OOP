package practice2;

class Main {
	public static void main(String[] args) {
		//task 1 usage
		Student stud1 = new Student(); //create student without values
		System.out.println("Student name: " + stud1.getName());
		System.out.println("Student id: " + stud1.getId());
		System.out.println("Year of study: " + stud1.getYearOfStudy());
		stud1.incYearOfStudy(); //increase year of study
		System.out.println("Year of study: " + stud1.getYearOfStudy());
		
		Student stud2 = new Student("Eva", 2); //create student with 2 values
		System.out.println("Student name:" + stud2.getName());
		System.out.println("Student id: " + stud2.getId());
		System.out.println("Year of study: " + stud2.getYearOfStudy());
		
		//task 2 usage
		StarTriangle star1 = new StarTriangle(); //default constructor
		System.out.println(star1.toString());
		
		StarTriangle star2 = new StarTriangle(5); //triangle of width 5
		System.out.println(star2.toString());
		
		//task 3 usage
		Time t1 = new Time(16,38,11);
		Time t2 = new Time(2, 44, 5);
		Time t3 = new Time(21, 15, 54);
		System.out.println("Standard format: " + t1.toStandard());
		System.out.println("Universal format: " + t1.toUniversal());
		
		System.out.println((Time.add(t1, t2)).toUniversal());
		System.out.println(t2.add(t3).toStandard());
		
	}
}
