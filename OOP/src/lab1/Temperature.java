package lab1;
//problem #3
public class Temperature {
	private double value;
	private char scale;
	
	//constructors
	public Temperature() {
		this(0, 'C');
	}
	
	public Temperature(double value) {
		this(value, 'C');
	}
	
	public Temperature(char scale) {
		this(0, scale);
	}
	
	public Temperature(double value, char scale) {
		setValueAndScale(value, scale);
	}
	//convert
//	public static double toCelsius(double value) {
//		return (5*(value-32)/9);
//	}
//	
//	public double toCelsius() {
//		setScale('C');
//		return(toCelsius(this.value));
//	}
//	
//	public static double toFahrenheit(double value) {
//		return ((9*(value/5))+32);
//	}
//	
//	public double toFahrenheit() {
//		setScale('F');
//		return(toFahrenheit(this.value));
//	}
	
	public static double convert(double value, char scale) {
		if(scale == 'C') {
			return ((9*(value/5))+32);
		}
		else return (5*(value-32)/9);
	}
	
	public double convert() {
		return convert(this.value, this.scale);
	}
	
	//getters
	public double getValue() {
		return value;
	}
	
	public char getScale() {
		return scale;
	}
	//setters
	public void setScale(char scale) {
		this.scale = scale;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setValueAndScale(double value, char scale) {
		if(scale=='C' || scale=='c' || scale=='F' || scale=='f') {
			setValue(value);
			setScale(scale);
		}
		else throw new IllegalArgumentException("Scale must be \"C\" || \"F\"");
	}
	
	public String toString() {
		return ""+this.value+this.scale;
	}
	
}
