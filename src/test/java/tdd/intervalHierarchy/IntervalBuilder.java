package tdd.intervalHierarchy;

public abstract class IntervalBuilder {
	
	protected double min;
	
	protected double max;
	
	IntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	public abstract Interval build();
	
}
