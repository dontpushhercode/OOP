package practice4;
//p:3
public class LogicGame implements Game {
	private String userName;
	
	public LogicGame(){
		
	}
	
	@Override
	public String getUserName() {
		return this.userName;
	}
	
	@Override
	public void start() {
		System.out.println("Game started!");
	}
	
	@Override
	public void setUserName(String name) {
		this.userName = name;
	}
	
	@Override
	public void exit() {
		System.out.println("Exit");
	}
}
