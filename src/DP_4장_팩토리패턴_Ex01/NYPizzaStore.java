package DP_4장_팩토리패턴_Ex01;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("Veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
