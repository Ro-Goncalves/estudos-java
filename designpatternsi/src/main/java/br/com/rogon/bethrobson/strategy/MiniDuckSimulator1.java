package br.com.rogon.bethrobson.strategy;

import br.com.rogon.bethrobson.strategy.duck.Duck;
import br.com.rogon.bethrobson.strategy.duck.MallardDuck;
import br.com.rogon.bethrobson.strategy.duck.ModelDuck;
import br.com.rogon.bethrobson.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        System.out.print("Mallard say: ");
        mallard.performQuack();
        System.out.print("Mallard fly: ");
        mallard.performFly();

        System.out.println("\n-------------------------------------\n");

        Duck model = new ModelDuck();
        System.out.print("Model fly: ");
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.print("Model fly again: ");
        model.performFly();
    }
}
