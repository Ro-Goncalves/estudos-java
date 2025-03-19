package br.com.rogon.tutorialspoint.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Integer executeStrategy(Integer num1, Integer num2){
        return strategy.doOperation(num1, num2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
