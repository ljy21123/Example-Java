package DesignPattern.템플릿메소드패턴_Ex01;

public class Nuguri extends Ramen {

    @Override
    public void putExtra() {
        System.out.println("콩나물을 넣는다.");
    }

    @Override
    public void waitForMinutes() {
        System.out.println("5분 기다린다.");
    }
}
