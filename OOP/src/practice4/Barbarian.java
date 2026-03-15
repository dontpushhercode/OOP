package practice4;
//my example
public class Barbarian extends Warrior {
	private double shieldStrength;
	
	public Barbarian(String name, double health, double damage, double shieldStrength) {
		super(name, health, damage);
		this.shieldStrength = shieldStrength;
	}
}
