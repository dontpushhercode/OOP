package lab3;
import java.util.Date;
import java.util.Vector;
//#4
public class WorkersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Eva", 69000, new Date(), "CP69");
		Employee e2 = e1.clone();
		Employee e3 = new Employee("Kuanysh", 58000, new Date(), "KI99");
		Employee e4 = new Employee("Adina", 85000, new Date(), "AD33");
		
		Vector<Employee> team = new Vector<>();
		team.add(e2);
		team.add(e3);
		team.add(e4);
		Manager m1 = new Manager("Mr. S", 99000, new Date(), "SS01", team, 40000);
		
		System.out.println(m1.getTeam());
		team.sort(null);
		System.out.println(m1.getTeam());
		team.sort(new NameComparator());
		System.out.println(m1.getTeam());
	}

}
