package practice4;
//p:3
public class MemoryGame implements IGame{
	private String userName;
	private boolean paused = false;
		
	public MemoryGame(){
			
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
		
	@Override
	public void pause() {
		if(paused) {
			paused = false;
			System.out.println("Unpaused");
		} else {
			paused = true;
			System.out.println("Paused");
		}
	}
}
