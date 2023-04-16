package DP_2장_옵저버패턴_Model03;

import java.util.Observable;
import java.util.Observer;

/** 통계 화면표시 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;   //최대 온도
    private float minTemp = 200;    //최소 온도
    private float tempSum = 0.0f;   //온도 합
    private int numReadings = 0;

    /** 통계 화면표시 */
    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    /** 온도, 습도, 업데이트 */
    public void update(Observable observable, Object arg) {

        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float temp = weatherData.getTemperature();

            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp > minTemp) {
                minTemp = temp;
            }
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
