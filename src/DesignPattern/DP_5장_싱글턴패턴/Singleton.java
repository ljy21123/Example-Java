package DesignPattern.DP_5장_싱글턴패턴;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("싱글턴 객체가 생성됩니다.");
    }

    public static synchronized Singleton getInstance() { // synchronized: 한번에 하나의 쓰레드 실행
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
    }
}
