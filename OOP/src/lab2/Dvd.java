package lab2;
//p:1 part:b
public class Dvd extends LibraryItem {
	private int duration;
	
	public Dvd(String title, String author, int publicationYear, int duration) {
		super(title, author, publicationYear);
		this.duration = duration;
	}
	
	//getters
	public int getDuration() {
		return duration;
	}
	
	//setters
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void playDvd() {
		for(int i=0;i<duration;i++) {
			System.out.println("Playing DVD: " + getTitle());
		}
	}
	
	@Override
	public String getContent() {
		return "Video content, duration: " +duration+ " minutes";
	}
	
	@Override
	public String toString() {
		return super.toString() + " duration: " +duration;
	}
}
