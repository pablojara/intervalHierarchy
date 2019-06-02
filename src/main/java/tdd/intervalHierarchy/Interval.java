package tdd.intervalHierarchy;

public class Interval {
	
	EndPoint FEP;
	EndPoint UEP;
	
	public Interval(double min, double max, boolean openFEP, boolean openUEP) {
		this.FEP = new EndPoint();
		this.UEP = new EndPoint();
		FEP.setValue(min);
		UEP.setValue(max);
		FEP.setOpen(openFEP);
		UEP.setOpen(openUEP);
	}
	
	public EndPoint getFEP() {
		return FEP;
	}
	public void setFEP(EndPoint fEP) {
		FEP = fEP;
	}
	public EndPoint getUEP() {
		return UEP;
	}
	public void setUEP(EndPoint uEP) {
		UEP = uEP;
	}

	public boolean isIntersected(Interval another) {
			return (!this.isEmpty() && !another.isEmpty()) &&
					(this.isIncluded(another.getFEP())  ||
					this.isIncluded(another.getUEP()) ||
					another.isIncluded(this.FEP) ||
					this.FEP.getValue() == another.getFEP().getValue());
	}

	public boolean isIncluded(EndPoint point) {
		return this.FEP.isInLeft(point) && this.UEP.isInRight(point);
	}
	
	public boolean isEmpty() {
		return this.FEP.getValue() == this.UEP.getValue();
		
	}
	
}