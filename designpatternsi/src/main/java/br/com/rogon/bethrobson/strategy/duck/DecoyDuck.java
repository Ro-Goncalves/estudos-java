package br.com.rogon.bethrobson.strategy.duck;

import br.com.rogon.bethrobson.strategy.fly.FlyNoWay;
import br.com.rogon.bethrobson.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
       System.out.println("I'm a duck Decoy");        
    }
    
}
