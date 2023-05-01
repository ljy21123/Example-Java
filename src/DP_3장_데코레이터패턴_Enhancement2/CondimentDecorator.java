package DP_3장_데코레이터패턴_Enhancement2;

public abstract class CondimentDecorator extends Beverage {   //재료 데코레이터

    protected Beverage beverage;    //음료 변수

    @Override
    public abstract String getDescription();    //오버라이딩한 음료 설명 추상 메소드
                                                //Beverage 클래스에서 이 메소드의 추상을 만들면 안되기에 여기서 만듬

}
