package DP_3장_데코레이터패턴;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;        //에스프레소는 기본 1.99달러 리턴
    }
}
