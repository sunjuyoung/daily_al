package oop.ch03;

public class Moca extends CandiDecorator{


    public Moca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.1;
    }

    @Override
    public String getDescription() {
        return beverage + "모카";
    }
}
