package br.com.rogon.bethrobson.strategy;

import java.util.ArrayList;

public class StrategyAnimalTest {
    public static void main(String[] args) {
        StrategyAnimalTest animalTest = new StrategyAnimalTest();
        animalTest.makeSomeAnimals();
    }

    private void makeSomeAnimals() {
        Animal dog = new Dog();
        Animal cat = new Cat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        animals.forEach(Animal::makeSound);
    }

    public abstract class Animal{
        abstract void makeSound();
    }

    public class Dog extends Animal{
        void makeSound(){
            bark();
        }
        void bark(){
            System.out.println("Dog say Woof");
        }
    }
    public class Cat extends Animal {
        void makeSound(){
            meow();
        }
        void meow(){
            System.out.println("Cat say Meow");
        }
    }

}
