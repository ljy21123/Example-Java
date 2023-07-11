package DesignPattern.DP_4장_팩토리패턴_Ex01;

/**
 * @name 이준영
 * @date 05.06
 */

public class TestDriver {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("Cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("Veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("Veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}

