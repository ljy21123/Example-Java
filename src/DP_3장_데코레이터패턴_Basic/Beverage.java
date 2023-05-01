package DP_3장_데코레이터패턴_Basic;

public abstract class Beverage {

    protected String description;

    public String getDescription() {    //리턴 받은 음료 설명 출력 함수
        return description;
    }

    public abstract double cost();  // 리턴받은 가격 함수
}
