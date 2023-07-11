package DesignPattern.DP_2장_옵저버패턴_Model02;

import java.util.List;
import java.util.Observer;

public abstract class Subject {

    protected List<Observer> observers; //옵저버들의 목록을 저장하는 리스트 변수 선언

    public abstract void registerObserver(Observer o);  //옵저버 등록
    public abstract void removeObserver(Observer o);    //옵저버 삭제
    public abstract void notifyObservers();             //옵저버 알림
}
