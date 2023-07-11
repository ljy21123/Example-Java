package DesignPattern.DP_1장_전략패턴;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다");
    }
}
