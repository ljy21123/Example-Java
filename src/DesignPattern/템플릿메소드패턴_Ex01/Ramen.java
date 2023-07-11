package DesignPattern.템플릿메소드패턴_Ex01;

public abstract class Ramen {

    public void makeRamen() {
        boilWater();
        putNoodles();
        putExtra();
        waitForMinutes();
    }

    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void putNoodles() {
        System.out.println("면을 넣는다.");
    }

    public abstract void putExtra();

    public abstract void waitForMinutes();
}
