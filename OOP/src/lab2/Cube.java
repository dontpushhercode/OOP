package lab2;
//p:1 part:a
public class Cube extends Shape3D {
	private double length;

	public Cube(double length) {
		this.length = length;
	}
	
	@Override
	protected double volume() {
		return Math.pow(length, 3);
	}

	@Override
	protected double surfaceArea() {
		return 6*Math.pow(length, 2);
	}

}
