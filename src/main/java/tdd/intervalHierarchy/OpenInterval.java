package tdd.intervalHierarchy;

public class OpenInterval extends Interval {

	public OpenInterval(double min, double max) {
		super(min,max);
		this.FEP.setOpen(true);
		this.UEP.setOpen(true);
	}
	
	public boolean isIntersected(Interval another) {		
		return this.isIncluded(another.getFEP().getData()) ||
			   this.isIncluded(another.getUEP().getData()) ||
			   another.isIncluded(this.getFEP().getData()) ||
			   this.getFEP().getData() == another.getFEP().getData();
	}

	protected boolean isIncluded(double value) {
		return this.getFEP().getData() < value && value < this.getUEP().getData();
	}


	
	
}
