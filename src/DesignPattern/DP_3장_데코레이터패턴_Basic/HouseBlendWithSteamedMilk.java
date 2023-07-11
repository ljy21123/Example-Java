package DesignPattern.DP_3장_데코레이터패턴_Basic;

/** 우유 추가한 하우스 블렌드 커피 */
public class HouseBlendWithSteamedMilk extends Beverage{

    public HouseBlendWithSteamedMilk() {
        description = "House Blend Coffe with Steamed Milk";
    }

    @Override
    public double cost() {
        return .89 + .1;
    }
}
