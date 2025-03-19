package br.com.rogon.bethrobson.strategy;

import br.com.rogon.bethrobson.strategy.duck.DecoyDuck;
import br.com.rogon.bethrobson.strategy.duck.Duck;
import br.com.rogon.bethrobson.strategy.duck.MallardDuck;
import br.com.rogon.bethrobson.strategy.duck.ModelDuck;
import br.com.rogon.bethrobson.strategy.duck.RubberDuck;
import br.com.rogon.bethrobson.strategy.fly.FlyBehavior;
import br.com.rogon.bethrobson.strategy.fly.FlyRocketPowered;
import br.com.rogon.bethrobson.strategy.quack.QuackBehavior;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        MallardDuck mallar = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberduckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallar.performQuack();
        rubberduckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
