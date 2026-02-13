package lab1;
//problem #1
public class Data {
	private int amount=0;
	private double average=0;
	private double largest=0;
	
	Data(){

	}
	
	public void add(int num) {
		amount++;
		setLargest(num);
		setAverage(num);
	}
	
	private void setLargest(int num) {
		if(num>largest) largest = num;
	}
	
	private void setAverage(int num) {
		average = ((average*(amount-1))+num)/amount;
	}
	
	public double getAverage() {
		return average;
	}
	
	public double getLargest() {
		return largest;
	}
	
}
