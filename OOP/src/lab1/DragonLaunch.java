package lab1;
import java.util.Vector;
//problem #5
public class DragonLaunch {
	private Vector<Person> vector = new Vector<>();
	
	public DragonLaunch(){
			
	}
	
	public void kidnap(Person p) {
		vector.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int top=-1;
		for(int i=0;i<vector.size();i++) {
			Person current = vector.get(i);
			if(top>=0 && vector.get(top).getGender()==Gender.B && current.getGender()==Gender.G) {
				top--;
			}
			else {
				top++;
				vector.set(top, current);
			}
		}
		return top>=0;
	}
}
