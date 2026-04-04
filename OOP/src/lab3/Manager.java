package lab3;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;
//#4
public class Manager extends Employee implements Comparable<Employee>{
	private Vector<Employee> team;
	private double bonus;
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, Vector<Employee>team, double bonus) {
		super(name, salary, hireDate, insuranceNumber);
		this.team = team;
		this.bonus = bonus;
	}
	
	public Manager() {
		
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public String getTeam() {
		String teamMembers = "Team: ";
		for(Employee e:team) {
			teamMembers+=e.getName()+", ";
		}
		return teamMembers;
	}
	
	@Override
	public String toString() {
		return "I'm a manager, my name is "+name+", my salary is "+salary+"+ my bonus is "+bonus+", I'm hired since"+hireDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(o.getClass()!=this.getClass()) return false;
		if(!super.equals(o)) return false;
		Manager m = (Manager) o;
		return this.bonus==m.bonus && Objects.equals(this.team, m.team);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.team, this.bonus);
	}
	
	@Override
	public int compareTo(Employee e) {
		int compareSalary = Double.compare(this.salary, e.salary);
		if(compareSalary != 0 ) return compareSalary;
		if(e instanceof Manager) {
			Manager m = (Manager) e;
			return Double.compare(this.bonus, m.bonus);
		}
		return compareSalary;
	}
	
	@Override
	public Manager clone() {
		Manager m = (Manager) super.clone();
		Vector<Employee> clonedTeam = new Vector<>();
		for(Employee e:team) {
			clonedTeam.add(e.clone());
		}
		m.team = clonedTeam;
		m.setBonus(this.getBonus());
		return m;
	}
}
