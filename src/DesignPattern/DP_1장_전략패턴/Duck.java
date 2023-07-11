package DesignPattern.DP_1장_전략패턴;

public abstract class Duck {
    FlyBehavior flyBehavior;    //행동 인터페이스 형식의 레퍼런스 변수들 선언
    QuackBehavior quackBehavior;    //모든 서브 클래스에서 이 변수들 상속

    public Duck() {}

    public abstract void display(); //추상 메소드

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }
}
