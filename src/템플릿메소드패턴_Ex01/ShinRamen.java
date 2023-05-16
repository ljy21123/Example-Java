package 템플릿메소드패턴_Ex01;

public class ShinRamen extends Ramen {
    @Override
    public void putExtra() {
        System.out.println("계란을 넣는다.");
    }

    @Override
    public void waitForMinutes() {
        System.out.println("4분 기다린다.");
    }
}
