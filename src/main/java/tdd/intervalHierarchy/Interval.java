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
		if(!FEP.isOpen() && !UEP.isOpen())
		{
			return this.isIncludedClosed(another.getFEP().getData()) ||
					this.isIncludedClosed(another.getUEP().getData())||
					another.isIncludedClosed(this.getFEP().getData());
		}
		return this.isIncludedOpen(another.getFEP().getData())  ||
				this.isIncludedOpen(another.getUEP().getData()) ||
				another.isIncludedOpen(this.getFEP().getData()) ||
				this.getFEP().getData() == another.getFEP().getData();
	}

	public boolean isIncludedClosed(double value) {
		return this.getFEP().getData() <= value && value <= this.getUEP().getData();
	}
	
	public boolean isIncludedOpen(double value) {
		return this.getFEP().getData() < value && value < this.getUEP().getData();
	}

}
