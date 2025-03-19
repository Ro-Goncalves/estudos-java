package br.com.rogon.tutorialspoint;

import br.com.rogon.tutorialspoint.strategy.Context;
import br.com.rogon.tutorialspoint.strategy.OperationAdd;
import br.com.rogon.tutorialspoint.strategy.OperationMultiply;
import br.com.rogon.tutorialspoint.strategy.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        
        System.out.println("Add       -> 2 + 2: " + context.executeStrategy(2, 2));

        context.setStrategy(new OperationSubstract());
        System.out.println("Substract -> 5 - 3: " + context.executeStrategy(5, 3));

        context.setStrategy(new OperationMultiply());
        System.out.println("Multiply  -> 3 * 2: " + context.executeStrategy(3, 2));
    }
    
}
