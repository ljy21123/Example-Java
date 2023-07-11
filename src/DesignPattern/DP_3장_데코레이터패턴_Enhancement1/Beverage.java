package DesignPattern.DP_3장_데코레이터패턴_Enhancement1;

public abstract class Beverage {

    protected String description;
    private boolean milk = false;
    private boolean mocha = false;
    // 필요 첨가물 더 추가 가능

    public String getDescription() {    //리턴 받은 음료 설명 출력 함수
        return description;
    }

    /**
     * 추가된 항목의 가격만 계산함.
     * 서브 클래스에서 cost() 메소드를 오버라이드할 때는
     * 그 기능을 확장하여 특정 음료 형식의 가격을 더함.
     */

    public double cost() {
        // 리턴받은 가격 함수
        double cost = 0.0;

        if (hasMilk()) {
            cost += 0.1;
        }
        if (hasMocha()) {
            cost += 0.2;
        }
        return cost;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
}
