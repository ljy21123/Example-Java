package DesignPattern.DP_2장_옵저버패턴_Model03;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    /** 날씨 정보 */
    public WeatherData() {
    }

    /** 측정값 변경 */
    public void measurementChanged() {
        setChanged();   //observable에 정의되어 있음
        notifyObservers();
    }

    /** 측정값 설정 */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
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
}
