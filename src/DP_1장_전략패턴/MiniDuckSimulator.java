package DP_1장_전략패턴;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mal = new MallardDuck();
        mal.display();
        mal.performQuack();
        mal.performFly();

        Duck toy = new ToyDuck();
        toy.display();
        toy.performFly();
        toy.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
