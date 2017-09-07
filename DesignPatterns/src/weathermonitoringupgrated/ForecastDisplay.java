package weathermonitoringupgrated;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements IDisplay, Observer {
	private float currentPressure=29.92f;
	private float lastPressure;
	Observable observable;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.lastPressure = this.currentPressure;
			this.currentPressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		if (currentPressure == lastPressure)
			System.out.println("Forecast: More of the same");
		else if (currentPressure > lastPressure)
			System.out.println("Forecast: Improving weather on the way");
		else if (currentPressure < lastPressure)
			System.out.println("Forecast: Watch out for cooler, rainy weather");
	}

}
