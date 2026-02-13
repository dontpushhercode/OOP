package lab1;
//problem #2
public class Character {
	private double damage;
	private double health;
	private final Caste caste;
	private static int amount = 0;
	
	{
		amount++;
	}
	
	Character(double damage, double health, Caste caste){
		this.damage = damage;
		this.health = health;
		this.caste = caste;
	}
	
	Character(double damage, Caste caste){
		this(damage, 100, caste);
	}
	
	Character(Caste caste){
		this(15, 100, caste);
	}
	
	Character(){
		this(15, 100, Caste.WARRIOR);
	}
	
	public double getDamage() {
		return damage;
	}
	
	public Caste getCaste() {
		return caste;
	}
	
	public double getHealth() {
		return health;	
	}
	
	public static int getAmount() {
		return amount;
	}
	
	private void takeDamage(double damage) {
		health-=damage;
		if(health<0) health = 0;
	}
	
	public void attack(Character other) {
		other.takeDamage(this.getDamage());
		System.out.println("Simple damage");
	}
	
	public void attack(Character other, Debuff debuff) {
		switch(debuff) {
			case POISON ->{
				other.takeDamage(this.getDamage()*1.2);
				System.out.println("The character is poisoned!");
			}
			case BURN ->{
				other.takeDamage(this.getDamage()*1.3);
				System.out.println("The character is burning!");
			}
			case FREEZE ->{
				other.takeDamage(this.getDamage()*1.1);
				System.out.println("The character is freezing!");
			}
		}
	}
}
