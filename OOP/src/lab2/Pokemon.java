package lab2;
//p:1 part:c
import java.util.Objects;

public class Pokemon {
	private String name;
	private double damage;
	private int health;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String name, double damage, int health) {
		this.name = name;
		this.damage = damage;
		this.health = health;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public double getDamage() {
		return damage;
	}
	
	public int getHealth() {
		return health;
	}
	
	@Override
	public String toString() {
		return "this pokemon " +name+ " with damage: "+damage+ " and health: " +health; 
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		Pokemon p = (Pokemon) o;
		return p.health == health && p.damage == damage && Objects.equals(name, p.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, damage, health);
	}
}
