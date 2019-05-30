package tdd.intervalHierarchy;

public abstract class Interval {
	
	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	protected double min;
	
	protected double max;

}
