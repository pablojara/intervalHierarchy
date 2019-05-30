package tdd.intervalHierarchy;

public class OpenInterval extends Interval {

	public OpenInterval(double min, double max) {
		super(min,max);
	}
	
	public boolean isIntersected(OpenInterval another) {
		return this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min)||
				 this.min == another.min;
	}

	private boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}

	
	
}
