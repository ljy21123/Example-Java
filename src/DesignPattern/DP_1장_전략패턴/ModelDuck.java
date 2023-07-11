package DesignPattern.DP_1장_전략패턴;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}
