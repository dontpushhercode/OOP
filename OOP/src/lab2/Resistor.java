package lab2;
//p:4
public class Resistor extends Circuit {

	private double potentialDifference;
	private double resistance;
	
	public Resistor(double r) {
		this.resistance = r;
	}
	
	
	public double getPotentialDifference() {
		return potentialDifference;
	}
	
	@Override
	public double getResistance() {
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		return potentialDifference;
	}

	@Override
	public void applyPotentialDiff(double v) {
		potentialDifference = v;
	}

}
