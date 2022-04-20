package oop.duck;

public class MallarDuck extends Duck{

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("물오리입니다");
    }
}
