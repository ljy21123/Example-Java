package DesignPattern.DP_1장_전략패턴;

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 장난감오리입니다");
    }


}
