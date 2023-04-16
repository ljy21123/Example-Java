package DP_2장_옵저버패턴_Model02;

/** 현재 상태 표시 클래스 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature = 0.0f;   //온도
    private float humidity = 0.0f;  //습도
    private Subject weatherData; //날씨 정보

    /** 현재 상태 화면표시 */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver((java.util.Observer) this);
    }

    /** 온도, 습도, 업데이트 */
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void  display() {
        System.out.println("Current conditions : " + temperature + "F degress and " + humidity + "% humidity");
    }
}
