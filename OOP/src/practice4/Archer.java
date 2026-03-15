package practice4;
//my example
public class Archer extends Warrior implements RangedAttack {
	private final static int ARROW_STRENGTH = 2;
	private int arrows;
	private double range;
	
	public Archer(String name, double health, double damage, int arrows, double range) {
		super(name, health, damage);
		this.arrows = arrows;
		this.range = range;
	}
	
	public double getRange() {
		return range;
	}
	
	@Override
	public void rangedAttack(Warrior w) {
		if(arrows>0) {
			w.getDamaged(damage*ARROW_STRENGTH);
			arrows-=1;
		}
	}
}
