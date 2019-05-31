package tdd.intervalHierarchy;

public class UntilEndPoint extends EndPoint{

	@Override
	public boolean isInLeft(double value) {
		if(this.open) {
			return this.value < value;
		}
		else
			return this.value <= value;
	}

	@Override
	public boolean isInRight(double value) {
		if(this.open) {
			return this.value > value;
		}
		else
			return this.value >= value;
	}


}
