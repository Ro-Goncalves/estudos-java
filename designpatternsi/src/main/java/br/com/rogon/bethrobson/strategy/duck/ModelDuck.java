package br.com.rogon.bethrobson.strategy.duck;

import br.com.rogon.bethrobson.strategy.fly.FlyNoWay;
import br.com.rogon.bethrobson.strategy.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
    
}
