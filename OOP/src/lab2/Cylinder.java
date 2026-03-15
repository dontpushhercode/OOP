package lab2;
//p:1 part:a
public class Cylinder extends Shape3D {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	protected double volume() {
		return Math.PI*Math.pow(radius, 2) * height;
	}

	@Override
	protected double surfaceArea() {
		return 2*Math.PI*radius*(radius+height);
	}

}
