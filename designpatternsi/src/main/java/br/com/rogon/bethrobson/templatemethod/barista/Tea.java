package br.com.rogon.bethrobson.templatemethod.barista;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCodiments() {
        System.out.println("Adding Lemon");
    }
    
}
