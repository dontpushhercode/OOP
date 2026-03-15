package practice4;
//my example
public class Witch extends Warrior implements RangedAttack {
	private int spellDuration;
	private double range;
	
	public Witch(String name, double health, double damage, int spellDuration, double range) {
		super(name, health, damage);
		this.spellDuration = spellDuration;
		this.range = range;
	}
	
	public double getRange() {
		return range;
	}
	
	@Override
	public void rangedAttack(Warrior w) {
		if(w instanceof Witch) {
			if(((Witch) w).getRange()<this.getRange()){
				w.getDamaged(damage*spellDuration);
			}
		} else {
			w.getDamaged(damage*spellDuration);
		}
	}
}
