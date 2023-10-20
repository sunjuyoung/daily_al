package oop.ch04;

public class OrderPizza {

    public Pizza orderPizza(String type){
        Pizza pizza = null;


        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("orion")){

        }else {

        }



        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}
