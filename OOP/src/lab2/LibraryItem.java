package lab2;
//p:1 part:b
public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	protected LibraryItem() {
		
	}
	
	protected LibraryItem(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	//getters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublicationYear(int year) {
		this.publicationYear = year;
	}
	
	@Override
	public String toString() {
		return "title: " +title+ " by: " +author+ ", publication year: " +publicationYear;
	}
	
	public abstract String getContent();
}
