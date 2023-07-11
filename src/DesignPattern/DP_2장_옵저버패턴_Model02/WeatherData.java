package DesignPattern.DP_2장_옵저버패턴_Model02;

import java.util.LinkedList;
import java.util.Observer;

public class WeatherData extends Subject{

    private float temperature;
    private float humidity;
    private float pressure;

    /** 날씨 정보 */
    public WeatherData() {
        observers = new LinkedList<>(); //observers를 LinkedList 클래스 인스턴스로 초기화 하고 객체들을 저장할 수 있게 설정,
                                        //<>는 제네릭 타입으로 다양한 데이터 타입 사용 가능하게 함
    }

    /** 옵저버 등록 */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /** 옵저버 삭제 */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);   //o 안에 객체가 있을시 0이상의 값 리턴
        if (i >= 0) {
            observers.remove(i);    //0이상 값 리턴되면 삭제
        }
    }

    /** 옵저버 알림 */
    public void notifyObservers() {

        /*for (Observer o : observers) {
           o.update(temperature, humidity, pressure);
        }*/

        /*observers.forEach((observer -> {    //람다 표현식
            observer.update(temperature, humidity, pressure);
        });*/
    }


    /** 측정값 변경 */
    public void measurementChanged() {
        notifyObservers();
    }

    /** 측정값 설정 */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }
}
