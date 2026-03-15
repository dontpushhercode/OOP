package lab2;
//p:1 part:c
import java.util.Objects;

public class FirePokemon extends Pokemon {
	private double burnDuration;
	
	public FirePokemon(String name, double damage, int health, double burnDuration) {
		super(name, damage, health);
		this.burnDuration = burnDuration;
	}
	
	//setters
	public void setBurnDuration(double duration) {
		burnDuration = duration;
	}
	
	//getters
	public double getBurnDuration() {
		return burnDuration;
	}
	
	@Override
	public String toString() {
		return super.toString() + " burn duration: " +burnDuration;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(o.getClass()!=this.getClass()) return false;
		if(!super.equals(o)) return false;
		FirePokemon fp = (FirePokemon) o;
		return fp.burnDuration == this.burnDuration;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), burnDuration);
	}
}
