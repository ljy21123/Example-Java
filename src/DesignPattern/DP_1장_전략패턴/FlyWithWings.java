package DesignPattern.DP_1장_전략패턴;

public class FlyWithWings implements FlyBehavior {
    //  날 수 있는 오리들
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
