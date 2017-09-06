package weathermonitoring;

public class CurrentDisplay implements IObserver, IDisplay {
	private float temp;
	private float humidity;
	private ISubject weatherData;
	
	public CurrentDisplay(ISubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current Conditions: "+temp+" degrees and "+humidity+"% humidity");
	}
}
