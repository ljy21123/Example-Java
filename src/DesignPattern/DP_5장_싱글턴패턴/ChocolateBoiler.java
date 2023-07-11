package DesignPattern.DP_5장_싱글턴패턴;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        System.out.println("ChocolateBoiler 생성자 실행");
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            try {
                System.out.println("\n1초간 지연됩니다.");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("\n1. 초콜렛 보일러의 유일한 객체를 생성");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("2. 초콜렛 보일러 객체를 반환");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("보일러가 비어 있으므로 초콜렛과 우유를 채웁니다.");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
            System.out.println("차있으며 끊고 있으므로 이제 비웁니다.");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("보일러에 초콜렛과 우유가 있으므로 끊입니다.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
