package lab2;
//p:4
public class Parallel extends Circuit {
	
	Circuit firstCircuit;
	Circuit secondCircuit;
	
	public Parallel(Circuit firstCircuit, Circuit secondCircuit) {
		this.firstCircuit = firstCircuit;
		this.secondCircuit = secondCircuit;
	}
	
	@Override
	public double getResistance() {
		double r1 = firstCircuit.getResistance();
		double r2 = secondCircuit.getResistance();
		
		return 1.0/(1.0/r1 + 1.0/r2);
	}

	@Override
	public double getPotentialDiff() {
		return firstCircuit.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double v) {
		firstCircuit.applyPotentialDiff(v);
		secondCircuit.applyPotentialDiff(v);
	}

}
