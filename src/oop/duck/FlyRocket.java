package oop.duck;

public class FlyRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다");
    }
}
