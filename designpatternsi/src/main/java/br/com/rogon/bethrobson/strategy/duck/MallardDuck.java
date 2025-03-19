package br.com.rogon.bethrobson.strategy.duck;

import br.com.rogon.bethrobson.strategy.fly.FlyWithWings;
import br.com.rogon.bethrobson.strategy.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");        
    }
    
}
