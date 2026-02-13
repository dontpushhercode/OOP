package lab1;
//problem #3
public class TemperatureUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t1 = new Temperature(28, 'C');
		t1.setValueAndScale(t1.convert(), 'F');
		System.out.println(t1.toString());
		
		Temperature t2 = new Temperature(86, 'F');
		t2.setValueAndScale(t2.convert(), 'C');
		System.out.println(t2.toString());
		
		Temperature t3 = new Temperature();
		t3.setValueAndScale(t3.convert(), 'F');
		System.out.println(t3.toString());
	}

}
