package tdd.intervalHierarchy;

public class OpenIntervalBuilder extends IntervalBuilder {

	OpenIntervalBuilder(){
		super();
	}
	
	@Override
	public Interval build() {
		assert min <= max;
		return new OpenInterval(min, max);
	}

}
