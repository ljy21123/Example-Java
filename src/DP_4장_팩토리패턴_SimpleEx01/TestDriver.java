package DP_4장_팩토리패턴_SimpleEx01;

public class TestDriver {

    /**
     * @name 이준영
     * @date 05.06
     * */

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza1 = store.orderPizza("Cheese");
        System.out.println(pizza1);

        Pizza pizza2 = store.orderPizza("greek");
        System.out.println(pizza2);

        String pizzaName = "PEPPERONI";
        Pizza pizza3 = store.orderPizza(pizzaName);

        if (pizza3 != null) {   //널 포인터 역참조 예방
            System.out.println(pizza3);
        } else {
            System.out.printf("%s 피자는 없습니다.\n", pizzaName);
        }
    }
}
