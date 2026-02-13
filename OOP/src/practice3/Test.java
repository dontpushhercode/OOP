package practice3;
//problem #2
import java.util.Vector;
import java.util.Scanner;
public class Test {
	
	private static Vector <Person> persons = new Vector<Person>();
	private static Scanner scan = new Scanner(System.in);

	public static void addPerson(int type) {
		if(type!=1 && type!=2 && type!=3) {
			System.out.println("Wrong type! :(");
			return;
		}
		else {
			System.out.println("Name: ");
			String name = scan.nextLine();
			System.out.println("Address: ");
			String address = scan.nextLine();
			switch(type) {
				case 1:
					Person p = new Person(name, address);
					persons.add(p);
					break;
				case 2:
					System.out.println("Program: ");
					String program = scan.nextLine();
					System.out.println("Year: ");
					int year = scan.nextInt();
					scan.nextLine();
					System.out.println("Fee: ");
					double fee = scan.nextDouble();
					scan.nextLine();
					Student s = new Student(name, address, program, year, fee);
					persons.add(s);
					break;
				case 3:
					System.out.println("School: ");
					String school = scan.nextLine();
					System.out.println("Pay: ");
					double pay = scan.nextDouble();
					scan.nextLine();
					Staff stf = new Staff(name, address, school, pay);
					persons.add(stf);
					break;
			}
		}
	}
	
	public static void printPersons() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Type 1 to exit, 2 to add new person, 3 to print info: ");
			String str = scan.nextLine();
			try {
				int command = Integer.parseInt(str);
				switch(command) {
					case 1:
						System.out.println("Exit");
						System.exit(0);
					case 2:
						System.out.println("Which type of person you would like to add? 1 - Person, 2 - Student, 3 - Employee");
						int type = scan.nextInt();
						scan.nextLine();
						addPerson(type);
						break;
					case 3:
						printPersons();
						break;
					default:
						System.out.println("Wrong command");
						break;
						
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Wrong command");
			}
		}
	}

}
