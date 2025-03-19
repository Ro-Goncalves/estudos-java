package br.com.rogon.tutorialspoint.strategy;

public class OperationAdd implements Strategy{

    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        return num1 + num2;
    }
    
}
