package DesignPattern.DP_4장_팩토리패턴_Ex01;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        System.out.println("--- Making a " + pizza.getName() + "---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
