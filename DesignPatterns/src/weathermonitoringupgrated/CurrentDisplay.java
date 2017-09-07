package weathermonitoringupgrated;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, IDisplay {
	Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherdata = (WeatherData) o;
			this.temp = weatherdata.getTemp();
			this.humidity = weatherdata.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: "+temp+" degrees and "+humidity+"% humidity");
	}

}
