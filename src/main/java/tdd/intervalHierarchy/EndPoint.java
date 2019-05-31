package tdd.intervalHierarchy;

public class EndPoint {

	protected double value;
	
	protected boolean open;
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public boolean isInLeft(EndPoint point) {
		if(this.open || point.isOpen()) {
			return this.value < point.getValue();
		}
		else
			return this.value <= point.getValue();
	}

	public boolean isInRight(EndPoint point) {
		if(this.open || point.isOpen()) {
			return this.value > point.getValue();
		}
		else
			return this.value >= point.getValue();
	}

}
