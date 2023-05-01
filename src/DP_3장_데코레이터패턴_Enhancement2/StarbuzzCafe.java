package DP_3장_데코레이터패턴_Enhancement2;

public class StarbuzzCafe {

    /**
     *
     * @name 이준영
     * @date 23.05.01
     */

    public static void main(String args[]) {

        Beverage b1 = new HouseBlend();
        System.out.println(b1.getDescription() + " $" + b1.cost());

        b1 = new Milk(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        Beverage b2 = new Mocha(new Mocha(new Milk(new HouseBlend())));
        System.out.println(b2.getDescription() + " $" + b2.cost());

    }
}
