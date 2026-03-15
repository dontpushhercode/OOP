package practice4;
//my example
public abstract class Warrior implements CanAttack{
	protected String name;
	protected double health;
	protected double damage;
	
	public Warrior(String name, double health, double damage) {
		this.name = name;
		this.health = health;
		this.damage = damage;
	}
	
	public Warrior() {
		
	}
	
	protected void getDamaged(double damage) {
		health -= damage;
	}
	
	@Override()
	public void attack(Warrior w) {
		w.getDamaged(damage);
	}
}
