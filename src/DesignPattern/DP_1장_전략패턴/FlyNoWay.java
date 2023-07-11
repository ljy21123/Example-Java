package DesignPattern.DP_1장_전략패턴;

public class FlyNoWay implements FlyBehavior {
    //  날 수 없는 오리들
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
