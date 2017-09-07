package weathermonitoringupgrated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements IDisplay, Observer {
	Observable observable;
	private float temp;
	private float sumTemp = 0;
	private float avgTemp;
	private List<Float> listTemp = new ArrayList<Float>();
	private float maxTemp;
	private float minTemp;
	
	public StatisticsDisplay(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temp = weatherData.getTemp();
			this.listTemp.add(this.temp);
			this.sumTemp += this.temp;
			this.avgTemp = this.sumTemp/this.listTemp.size();
			this.maxTemp = Collections.max(this.listTemp);
			this.minTemp = Collections.min(this.listTemp);
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = "+avgTemp+"/"+maxTemp+"/"+minTemp);
	}

}
