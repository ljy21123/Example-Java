package DesignPattern.DP_2장_옵저버패턴_Model03;

import java.util.Observable;
import java.util.Observer;

/** 현재 상태 표시 클래스 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature = 0.0f;   //온도
    private float humidity = 0.0f;  //습도

    /** 현재 상태 화면표시 */
    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    /** 온도, 습도, 업데이트 */
    public void update(Observable observable, Object arg) {

        if (observable instanceof WeatherData) {    //instanceof : 객체 타입 확인하고 true or false 반환
                                                    //이상한 객체 타입 오면 문제 발생하기 때문에 사용
                                                    //instanceof는 객체지향적이지 않다
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void  display() {
        System.out.println("Current conditions : " + temperature + "F degress and " + humidity + "% humidity");
    }
}
