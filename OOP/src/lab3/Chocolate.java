package lab3;
//#5
public class Chocolate implements Comparable<Chocolate>{
	private double weight;
	private String name;
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public Chocolate() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "name: "+name+", weight: "+weight;
	}
	
	@Override
	public int compareTo(Chocolate c) {
		return Double.compare(this.getWeight(), c.getWeight());
	}
}
