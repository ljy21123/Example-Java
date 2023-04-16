package DP_2장_옵저버패턴_Model02;

/** 일기예보 화면표시 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f; //현재 압력
    private float lastPressure; //이전 압력
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver((java.util.Observer) this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast : ");
        if (currentPressure > lastPressure) {
            System.out.println("날씨가 좋아지는 중입니다!");
        } else if (currentPressure == lastPressure) {
            System.out.println("같은 날씨가 계속됩니다.");
        } else if (currentPressure < lastPressure) {
            System.out.println("더 시원하지만 비가 오는 날씨를 조심하세요.");
        }
    }
}
