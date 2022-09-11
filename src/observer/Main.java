package observer;

import observer.display.CurrentConditionDisplay;
import observer.display.HeatIndexDisplay;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("====================================");
		weatherData.setMeasurements(70, 55, 20.4f);
		System.out.println("====================================");
		weatherData.setMeasurements(60, 45, 10.4f);
		System.out.println("====================================");
		weatherData.setMeasurements(50, 35, 5.4f);

	}
}
