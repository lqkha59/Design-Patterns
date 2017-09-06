package weathermonitoring;

import java.util.ArrayList;

public class WeatherData implements ISubject {
	private ArrayList<IObserver> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		int i = observers.indexOf(o);
		if (i>=0)
			observers.remove(i);
	}

	@Override
	public void notifyObserver() {
		for(int i=0; i<observers.size(); i++) {
			IObserver observer = (IObserver) observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
