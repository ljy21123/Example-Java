package DP_3장_데코레이터패턴_Enhancement2;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffe";  //재료 설명
    }
    @Override
    public double cost() {
        return .89;         //하우스 블렌드는 기본 0.89달러 리턴
    }
}
