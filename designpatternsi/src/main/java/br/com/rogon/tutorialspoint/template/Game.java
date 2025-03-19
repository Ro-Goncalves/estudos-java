package br.com.rogon.tutorialspoint.template;

public abstract class Game {
    abstract void initializer();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initializer();
        startPlay();
        endPlay();
    }
}
