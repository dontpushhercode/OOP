package practice2;

class StarTriangle {
	private int width;
	private static String star = "[*]";
	
	StarTriangle(){
		this(1);
	}
	
	StarTriangle(int width){
		this.width = width;
	}
	
	public String toString() {
		String starResult = "";
		for(int i=1;i<=width;i++) {
			for(int j=0;j<i;j++) {
				starResult+=star;
			}
			starResult+="\n";
		}
		return starResult;
	}
}
