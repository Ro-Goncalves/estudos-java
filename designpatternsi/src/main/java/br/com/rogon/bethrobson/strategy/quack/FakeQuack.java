package br.com.rogon.bethrobson.strategy.quack;

public class FakeQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Qwak");        
    }
    
}
