package lab2;
//p:4
public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double v);
	
	public double getPower() {
		double v = getPotentialDiff();
		double r = getResistance();
		return v*v/r;
	}
	
	public double getCurrent() {
		return getPotentialDiff()/getResistance();
	}
}
