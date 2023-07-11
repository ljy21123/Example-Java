package DesignPattern.DP_5장_싱글턴패턴;

public class ChocolateController {

    public static void main(String[] args) {
        new Thread(() -> {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            System.out.println("객체 정보: " + boiler);
            boiler.fill();
            boiler.boil();
            boiler.drain();
        }).start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }

        new Thread(() -> {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            System.out.println("객체 정보: " + boiler);
            boiler.fill();
            boiler.boil();
            boiler.drain();
        }).start();
    }
}