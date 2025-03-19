package br.com.rogon.bethrobson.strategy.fly;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
    
}
