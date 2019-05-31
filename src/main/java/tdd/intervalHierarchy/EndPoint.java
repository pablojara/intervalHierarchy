package tdd.intervalHierarchy;

public abstract class EndPoint {

	protected double value;
	
	protected boolean open;
	
	public double getData() {
		return value;
	}

	public void setData(double data) {
		this.value = data;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public abstract boolean isInLeft(double value);
	
	public abstract boolean isInRight(double value);

}
