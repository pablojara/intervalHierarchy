package tdd.intervalHierarchy;

public class ClosedIntervalBuilder extends IntervalBuilder{


	ClosedIntervalBuilder(){
		super();
	}
	
	@Override
	public Interval build() {
		assert min <= max;
		return new ClosedInterval(min, max);
	}

}
