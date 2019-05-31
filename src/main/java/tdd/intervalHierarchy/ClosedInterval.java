package tdd.intervalHierarchy;

public class ClosedInterval extends Interval {

	public ClosedInterval(double min, double max) {
		super(min,max);
		this.FEP.setOpen(false);
		this.UEP.setOpen(false);
	}
	
	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.getFEP().getData()) ||
				this.isIncluded(another.getUEP().getData())||
				another.isIncluded(this.getFEP().getData());
	}

	public boolean isIncluded(double value) {
		return this.getFEP().getData() <= value && value <= this.getUEP().getData();
	}

}
