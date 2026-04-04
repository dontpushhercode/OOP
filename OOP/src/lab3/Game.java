package lab3;
//#1
public abstract class Game {
	private String title;
	private String devCompany;
	
	private Game() {
		
	}
	
	private Game(String title, String devCompany) {
		this.title = title;
		this.devCompany = devCompany;
	}
	
	public abstract void play();
}
