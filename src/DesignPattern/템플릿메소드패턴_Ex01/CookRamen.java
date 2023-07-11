package DesignPattern.템플릿메소드패턴_Ex01;

public class CookRamen {

    public static void main(String[] args) {

        ShinRamen shinRamen = new ShinRamen();
        Nuguri nuguri = new Nuguri();

        shinRamen.makeRamen();
        System.out.println("-------------------");
        nuguri.makeRamen();

    }
}
