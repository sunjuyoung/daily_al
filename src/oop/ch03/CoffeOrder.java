package oop.ch03;

public class CoffeOrder {
    public static void main(String[] args) {
        Beverage espresso  = new Espresso();
        espresso = new Moca(espresso);

        System.out.println(espresso.getDescription());
    }
}
