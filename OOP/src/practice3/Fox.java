package practice3;
//problem 1
public class Fox extends Animal{
	private static final Color DEF_FUR_COLOR = Color.RED;
	
	private Color furColor;
	//constructors
	public Fox() {
		this(DEF_NAME,DEF_FUR_COLOR, DEF_AGE);
	}
	
	public Fox(String name) {
		this(name, DEF_FUR_COLOR, DEF_AGE);
	}
	
	public Fox(String name, Color furColor) {
		this(name, furColor, DEF_AGE);
	}
	
	public Fox(String name, int age) {
		this(name, DEF_FUR_COLOR, age);
	}
	
	public Fox(String name, Color furColor, int age) {
		super(name, age);
		this.furColor = furColor;
	}
	
	//getters
	public String getColor() {
		return furColor.toString().toLowerCase();
	}
	
	@Override
	public void run() {
		System.out.println("Fox is running");
	}
	//overload overridden method
	public void run(Animal animal) {
		if(animal instanceof Fox) {
			Fox other = (Fox) animal;
			System.out.println(getColor()+" fox is running to another "+ other.getColor()+" fox");
		}
		else System.out.println(getColor()+" fox is running to the animal");
	}
	
	//new method
	public void whatDoesTheFoxSay() {
		System.out.println("ฅ^>⩊<^ฅ");
	}
	//overload new method
	public void whatDoesTheFoxSay(String words) {
		System.out.println("Foxes say: " + words);
	}
}
