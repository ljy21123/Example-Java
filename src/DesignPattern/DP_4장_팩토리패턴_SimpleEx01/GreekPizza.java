package DesignPattern.DP_4장_팩토리패턴_SimpleEx01;

public class GreekPizza extends Pizza {

    public GreekPizza() {
        name = "Greek Pizza";
        dough = "Oily Crust";
        sauce = "Tomato Sauce";
        toppings.add("Feta Cheese");
        toppings.add("Onion");
        toppings.add("Olive");
    }
}
