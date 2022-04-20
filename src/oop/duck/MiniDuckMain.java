package oop.duck;

public class MiniDuckMain {
    public static void main(String[] args) {
/*        Duck m = new MallarDuck();
        m.performFly();
        m.performQuack();*/

        Duck m1 = new ModelDuck();
       m1.performFly();
       m1.setFlyBehavior(new FlyRocket());
       m1.performFly();
    }
}
