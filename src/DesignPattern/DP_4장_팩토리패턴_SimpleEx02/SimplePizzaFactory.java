package DesignPattern.DP_4장_팩토리패턴_SimpleEx02;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            // 더이상 그릭피자를 생산하지 않는다면?
            pizza = new GreekPizza();
        } else if (type.equals("clam")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
