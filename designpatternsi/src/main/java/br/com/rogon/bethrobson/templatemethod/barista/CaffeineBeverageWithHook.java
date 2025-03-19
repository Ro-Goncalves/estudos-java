package br.com.rogon.bethrobson.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {
    
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pourin into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
