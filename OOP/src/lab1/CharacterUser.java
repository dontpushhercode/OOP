package lab1;
//problem #2
public class CharacterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch1 = new Character(10, 100, Caste.WIZARD);
		Character ch2 = new Character(20, 50, Caste.ASSASIN);
		ch1.attack(ch2);
		ch2.attack(ch1, Debuff.BURN);
	}

}
