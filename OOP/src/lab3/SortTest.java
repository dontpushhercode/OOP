package lab3;
import java.util.Date;
//#5
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate kinder = new Chocolate("Kinder", 0.05);
		Chocolate alpenGold = new Chocolate("AlpenGold", 0.14);
		Chocolate roshen = new Chocolate("Roshen", 0.1);
		
		Chocolate[] chocoBasket = new Chocolate[3];
		chocoBasket[0]=kinder;
		chocoBasket[1]=alpenGold;
		chocoBasket[2]=roshen;
		
		Sort.quickSort(chocoBasket);
		for(Chocolate c:chocoBasket) System.out.println(c);
		
		Time t1 = new Time(23, 59, 11);
		Time t2 = new Time(9, 30, 0);
		Time t3 = new Time(11, 59, 11);
		
		Time[] times = new Time[3];
		times[0] = t1;
		times[1] = t2;
		times[2] = t3;
		
		Sort.mergeSort(times);
		for(Time t:times) System.out.println(t);
		
		Employee e1 = new Employee("Eva", 69000, new Date(), "CP69");
		Employee e2 = new Employee("Kuanysh", 58000, new Date(), "KI99");
		Employee e3 = new Employee("Adina", 85000, new Date(), "AD33");
		
		Employee[] workers = new Employee[3];
		workers[0] = e1;
		workers[1] = e2;
		workers[2] = e3;
		
		Sort.quickSort(workers);
		for(Employee e:workers) System.out.println(e);
	}

}
