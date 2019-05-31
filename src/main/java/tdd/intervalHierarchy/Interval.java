package tdd.intervalHierarchy;

public class Interval {
	
	FromEndPoint FEP;
	UntilEndPoint UEP;
	
	public Interval(double min, double max, boolean openFEP, boolean openUEP) {
		this.FEP = new FromEndPoint();
		this.UEP = new UntilEndPoint();
		
		FEP.setData(min);
		UEP.setData(max);
		FEP.setOpen(openUEP);
		UEP.setOpen(openUEP);
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

	public boolean isIntersected(Interval another) {
			return this.isIncluded(another.getFEP().getData())  ||
					this.isIncluded(another.getUEP().getData()) ||
					another.isIncluded(this.FEP.getData()) ||
					this.FEP.getData() == another.getFEP().getData();
	}

	public boolean isIncluded(double value) {
		return this.FEP.isInLeft(value) && this.UEP.isInRight(value);
	}
	
}
