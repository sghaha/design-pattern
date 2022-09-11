package observer;

import observer.display.CurrentConditionDisplay;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(70, 55, 20.4f);
		weatherData.setMeasurements(60, 45, 10.4f);
		weatherData.setMeasurements(50, 35, 5.4f);

	}
}
