package lab2;
//p:5
public class PetSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Person eva = new Student("Eva", 21, 3.7);
		Person kuanysh = new PhDStudent("Kuanysh", 19, "KBTU");
		Person durov = new Employee("Pavel Durov", 41, "Telegram");
		
		Animal kisa = new Cat("Neko", 4);
		Animal sharik = new Dog("Sharik", 2);
		
		eva.assignPet(kisa);
		durov.assignPet(sharik);
		
		PersonRegistry pr = new PersonRegistry();
		pr.addPerson(durov);
		pr.addPerson(kuanysh);
		pr.addPerson(eva);
		
		System.out.println(pr);
		durov.leavePetWith(kuanysh);
		System.out.println(pr);
		eva.leavePetWith(kuanysh);
		System.out.println(pr);
		eva.retrievePetFrom(kuanysh);
		System.out.println(pr);
	}

}
