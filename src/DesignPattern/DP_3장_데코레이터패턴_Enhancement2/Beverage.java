package DesignPattern.DP_3장_데코레이터패턴_Enhancement2;

public abstract class Beverage {

    protected Beverage beverage;
    protected String description = "Unknown Beverage"; //음료의 설명 변수

    public String getDescription() {    //리턴 받은 음료 설명 출력 함수
        return description;
    }

    public abstract double cost();  // 리턴받은 가격 함수
}
