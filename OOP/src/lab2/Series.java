package lab2;
//p:4
public class Series extends Circuit {
	
	private Circuit firstCircuit;
	private Circuit secondCircuit;

	public Series(Circuit a, Circuit b) {
		this.firstCircuit = a;
		this.secondCircuit = b;
	}
	
	@Override
	public double getResistance() {
		return firstCircuit.getResistance()+secondCircuit.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return firstCircuit.getPotentialDiff()+secondCircuit.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double v) { // I=V/R
		double rTotal = getResistance();
		double i = v/rTotal;
		
		double v1 = i * firstCircuit.getResistance(); 
		firstCircuit.applyPotentialDiff(v1);
		
		double v2 = i * secondCircuit.getResistance();
		secondCircuit.applyPotentialDiff(v2);
	}

}
