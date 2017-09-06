package weathermonitoring;

import java.util.*;
import java.util.Collections;

public class StatisticsDisplay implements IDisplay, IObserver {
	private float temp;
	private float avgTemp;
	private List<Float> tempList = new ArrayList<Float>();
	private float sumTemp = 0;
	private float maxTemp;
	private float minTemp;
	private ISubject weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.tempList.add(new Float(temp));
		this.temp = temp;
		this.sumTemp += temp;
		this.avgTemp = this.sumTemp/this.tempList.size();
		this.maxTemp = Collections.max(this.tempList);
		this.minTemp = Collections.min(this.tempList);
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = "+avgTemp+"/"+maxTemp+"/"+minTemp);
	}

}
