package DP_3장_데코레이터패턴_Basic;

/** 우유 추가한 하우스 블렌드 커피 */
public class HouseBlendWithSteamedMilk extends Beverage{

    public HouseBlendWithSteamedMilk() {
        description = "House Blend Coffe with Steamed Milk";
    }

    //basic 단점 : 새로운 첨가물이 있을 때마다 새로운 클래스를 만들어야한다.

    @Override
    public double cost() {
        return .89 + .1;
    }
}
