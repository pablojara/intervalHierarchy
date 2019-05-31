package tdd.intervalHierarchy;

public abstract class EndPoint {

	protected double data;
	
	protected boolean open;
	
	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
}
