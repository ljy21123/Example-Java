package DesignPattern.DP_4장_팩토리패턴_Ex01;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("Veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
