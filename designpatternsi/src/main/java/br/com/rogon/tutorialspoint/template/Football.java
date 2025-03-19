package br.com.rogon.tutorialspoint.template;

public class Football extends Game{

    @Override
    void initializer() {
        System.out.println("Football Game Initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
    
}
