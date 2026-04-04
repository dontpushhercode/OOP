package lab3;
import java.util.Date;
import java.util.Objects;
//#4
public class Employee extends Person implements Comparable<Employee>, Cloneable{
	protected double salary;
	protected Date hireDate;
	protected String insuranceNumber;
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public Employee() {
		
	}
	
	//setters
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public void setInsuranceNumber(String insNumber) {
		this.insuranceNumber = insNumber;
	}
	
	//getters
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	@Override
	public String toString() {
		return "I'm an employee, my name is "+name+", my salary is "+salary+", I'm hired since "
	+hireDate+", and my insurance number is "+insuranceNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		if(!super.equals(o)) return false;
		Employee e = (Employee) o;
		return Double.compare(this.salary, e.salary)==0 && this.hireDate.equals(e.hireDate) 
				&& this.insuranceNumber.equals(e.insuranceNumber);
	}				
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
	}
	
	@Override
	public int compareTo(Employee e) {
		return Double.compare(this.salary, e.salary);
	}
	
	@Override
	public Employee clone() {
		Employee e = new Employee();
		e.setName(this.getName());
		e.setSalary(this.getSalary());
		e.setInsuranceNumber(this.getInsuranceNumber());
		e.setHireDate((Date)this.getHireDate().clone());
		return e;
	}
}
