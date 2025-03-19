package br.com.rogon.bethrobson.templatemethod.barista;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffe through filter");
    }

    @Override
    void addCodiments() {
        System.out.println("Adding Sugar and Milk");
    }
    
}
