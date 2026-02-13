package lab1;
//problem #5
public class DragonLaunchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person b1 = new Person(Gender.B);
		Person b2 = new Person(Gender.B);
		Person g1 = new Person(Gender.G);
		Person g2 = new Person(Gender.G);
		
		DragonLaunch dl = new DragonLaunch();
		dl.kidnap(b1);
		dl.kidnap(b2);
		dl.kidnap(g1);
		dl.kidnap(g2);
		
		if (dl.willDragonEatOrNot()) {
		    System.out.println("OMG she ate and left no crumbs");
		} else {
		    System.out.println("Hungry");
		}
	}

}
