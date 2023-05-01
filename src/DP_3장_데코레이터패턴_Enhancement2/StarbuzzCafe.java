package DP_3장_데코레이터패턴_Enhancement2;

public class StarbuzzCafe {

    public static void main(String args[]) {
        Beverage b1 = new Mocha(new Mocha(new Milk(new HouseBlend())));
        System.out.println(b1.getDescription() + " $" + b1.cost());

    }
}
