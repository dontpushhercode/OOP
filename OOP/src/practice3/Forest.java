package practice3;
//problem #1
public class Forest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal undefinedAnimal = new Animal("Bigfoot", 15);
		Fox foxy = new Fox("Eevee", Color.RED, 3);
		Fox foxy2 = new Fox("Sylveon", Color.ARCTIC, 2);
		
		undefinedAnimal.run(); //superclass using method
		foxy.run(); //subclass using overridden method
		foxy.run(foxy2); //subclass using overridden overloaded method
		foxy.whatDoesTheFoxSay(); //subclass using specific method
		foxy.whatDoesTheFoxSay("ring-ding-ding"); //subclass using overloaded specific method
	}

}
