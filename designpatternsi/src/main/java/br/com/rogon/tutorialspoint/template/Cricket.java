package br.com.rogon.tutorialspoint.template;

public class Cricket extends Game{

    @Override
    void initializer() {
        System.out.println("Cricket Game Initialized! Start playing.");        
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the Game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }
    
}
