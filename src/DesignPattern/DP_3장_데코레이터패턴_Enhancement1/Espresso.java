package DesignPattern.DP_3장_데코레이터패턴_Enhancement1;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }
}
