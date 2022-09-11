package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;
	private List<Observer> observers; //옵저버 객체

	public WeatherData() {
		this.observers = new ArrayList<>(); //생성할때 옵저버를 초기화함
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	//기상 관측값이 갱신될 때마다 이 메소드가 호출됩니다.
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float t, float h, float p) {
		//사실 어디서 값을 받아오면 더 좋겠지만 이정도로 하자
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer); //옵저버 등록함
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer); //옵저버 탈퇴
	}

	@Override
	public void notifyObservers() {
		//각각의 옵저버에게 현재 상태 update해주기
		observers.stream().forEach(o ->{
			o.update(temperature, humidity, pressure);
		});
	}
}
