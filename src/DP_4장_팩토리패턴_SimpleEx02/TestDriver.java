package DP_4장_팩토리패턴_SimpleEx02;

public class TestDriver {

    /**
     * @name 이준영
     * @date 05.06
     */

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.name + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.name + "\n");

    }
}

