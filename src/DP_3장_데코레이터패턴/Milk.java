package DP_3장_데코레이터패턴;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {              //우유는 0.10달러 추가 후 리턴
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
