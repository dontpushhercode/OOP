package lab2;
//p:2
public enum Column {
	A, B, C, D, E, F, G, H;
	
	public int getIndex() {
		return this.ordinal();
	}
	
	public static Column getColumn(int index) {
		if(index < 0 || index > 7) throw new IllegalArgumentException("Index must be 0-7");
	    return Column.values()[index];
	}
}
