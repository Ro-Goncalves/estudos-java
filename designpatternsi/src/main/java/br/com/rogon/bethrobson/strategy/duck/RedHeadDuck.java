package br.com.rogon.bethrobson.strategy.duck;

import br.com.rogon.bethrobson.strategy.fly.FlyWithWings;
import br.com.rogon.bethrobson.strategy.quack.Quack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I1m a real Red headed duck");
    }
    
}
