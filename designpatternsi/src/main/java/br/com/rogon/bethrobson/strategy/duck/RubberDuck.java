package br.com.rogon.bethrobson.strategy.duck;

import br.com.rogon.bethrobson.strategy.fly.FlyBehavior;
import br.com.rogon.bethrobson.strategy.fly.FlyNoWay;
import br.com.rogon.bethrobson.strategy.quack.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
    
}
