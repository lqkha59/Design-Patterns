package weathermonitoring;

public class HeatIndexDisplay implements IDisplay, IObserver {
	private float T;
	private float H;
	private float heatindex;
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.T= temp;
		this.H = humidity;
//		this.heatindex = ?
		display();
	}

	@Override
	public void display() {
		System.out.println("Heat index is "+heatindex);
	}

}
