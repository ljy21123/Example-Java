package DesignPattern.DP_3장_데코레이터패턴_Enhancement2;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {              //모카는 0.20달러 추가 후 리턴
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
