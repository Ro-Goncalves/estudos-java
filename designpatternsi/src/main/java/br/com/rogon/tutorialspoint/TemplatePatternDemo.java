package br.com.rogon.tutorialspoint;

import br.com.rogon.tutorialspoint.template.Cricket;
import br.com.rogon.tutorialspoint.template.Football;
import br.com.rogon.tutorialspoint.template.Game;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        System.out.println("---------------------------------------");

        Game football = new Football();
        football.play();
    }
}
