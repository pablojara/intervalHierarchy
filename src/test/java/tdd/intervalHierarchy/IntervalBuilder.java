package tdd.intervalHierarchy;

public class IntervalBuilder {
	
	private double min;
	private double max;
	
	private boolean openFEP;
	private boolean openUEP;
	
	IntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.openFEP = false;
		this.openUEP = false;
	}
	
	IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	IntervalBuilder openFEP(boolean open) {
		this.openFEP = open;
		return this;
	}
	
	IntervalBuilder openUEP(boolean open) {
		this.openUEP = open;
		return this;
	}
	
	public Interval build() {
		return new Interval(min, max, openFEP, openUEP);
		
	}
	
}
