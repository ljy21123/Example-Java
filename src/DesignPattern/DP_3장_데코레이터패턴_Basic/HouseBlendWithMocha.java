package DesignPattern.DP_3장_데코레이터패턴_Basic;

/** 모카 추가한 하우스 블렌드 커피 */
public class HouseBlendWithMocha extends Beverage{

    public HouseBlendWithMocha() {
        description = "House Blend with Mocha";
    }

    @Override
    public double cost() {
        return .89 + .2;
    }
}
