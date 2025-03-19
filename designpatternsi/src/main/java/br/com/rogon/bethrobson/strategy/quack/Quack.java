package br.com.rogon.bethrobson.strategy.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
