package br.com.rogon.bethrobson.templatemethod.barista;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCodiments();
    }

    abstract void brew();
    abstract void addCodiments();

    void boilWater(){
        System.out.println("Boiling Water.");
    }

    void pourInCup(){
        System.out.println("Pouring into cup.");
    }
    
}
