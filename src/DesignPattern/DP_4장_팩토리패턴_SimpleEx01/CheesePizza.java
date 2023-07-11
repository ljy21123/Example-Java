package DesignPattern.DP_4장_팩토리패턴_SimpleEx01;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
