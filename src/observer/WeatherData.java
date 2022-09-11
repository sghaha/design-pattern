package observer;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;

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
	public void measurementsChanged(){
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();

		//각 디스플레이를 갱신
		//currentConditionsDisplay.update(temp, humidity, pressure);
		//statisticsDisplay.update(temp, humidity, pressure);
		//forecastDisplay.update(temp, humidity, pressure);
		//1. 구체적인 구현에 맞춰서 코딩했음. 프로그램을 고치지 않고는 다른 디스플레이를 추가하거나 제거할수 없음
		//2. 디스플레이 항목과 데이터를 주고받는데 공통된 인터페이스를 사용하고 있는것 같음

	}
}
