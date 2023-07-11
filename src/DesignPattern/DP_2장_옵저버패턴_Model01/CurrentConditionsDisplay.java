package DesignPattern.DP_2장_옵저버패턴_Model01;

/** 현재 상태 표시 클래스 */
public class CurrentConditionsDisplay {
    private float temperature = 0.0f;   //온도
    private float humidity = 0.0f;  //습도

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
