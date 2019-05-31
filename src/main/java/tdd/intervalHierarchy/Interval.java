package tdd.intervalHierarchy;

public abstract class Interval {
	
	public Interval(double min, double max) {
		this.FEP = new FromEndPoint();
		this.UEP = new UntilEndPoint();
		
		FEP.setData(min);
		UEP.setData(max);
	}
	
	public FromEndPoint getFEP() {
		return FEP;
	}
	public void setFEP(FromEndPoint fEP) {
		FEP = fEP;
	}
	public UntilEndPoint getUEP() {
		return UEP;
	}
	public void setUEP(UntilEndPoint uEP) {
		UEP = uEP;
	}

	FromEndPoint FEP;
	UntilEndPoint UEP;
	
	
	abstract public boolean isIntersected(Interval another);
	abstract protected boolean isIncluded(double value);

}
