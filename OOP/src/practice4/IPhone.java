package practice4;
//p:2
public class IPhone extends Device implements SellableAndPluggable{
	
	public void plugIn() {
		System.out.println("The iPhone is charging");
	}
	
	public void sell() {
		System.out.println("The iPhone is sold");
	}
}
