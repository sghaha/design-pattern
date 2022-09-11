package observer.display;

import observer.DisplayElement;
import observer.Observer;
import observer.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("현재 상태 : 온도 "+temperature +", 습도 : "+ humidity);
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
		//사실 update가 될때 display를 호출하는게 최선의 방법은 아니다.
		// 나중에 mvc패턴을 배울때 더 자세히 알아보기로
	}
}
