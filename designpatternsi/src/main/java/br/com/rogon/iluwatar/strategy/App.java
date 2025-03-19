package br.com.rogon.iluwatar.strategy;

import br.com.rogon.iluwatar.strategy.dragonslayer.LambdaStrategy;
import br.com.rogon.iluwatar.strategy.dragonslayer.MeleeStrategy;
import br.com.rogon.iluwatar.strategy.dragonslayer.ProjectileStrategy;
import br.com.rogon.iluwatar.strategy.dragonslayer.SpellStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    private static final String RED_DRAGON_EMERGES = "Red dragon emerges.";
    private static final String GREEN_DRAGON_SPOTTED = "Green dragon spotted ahead!";
    private static final String BLACK_DRAGON_LANDS = "Black dragon lands before you.";

    public static void main(String[] args) {
        log.info(GREEN_DRAGON_SPOTTED);        
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        log.info(RED_DRAGON_EMERGES);
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        log.info(BLACK_DRAGON_LANDS);
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        //Implementação funcional com java 8
        log.info(GREEN_DRAGON_SPOTTED);
        dragonSlayer = new DragonSlayer(() ->
            log.info("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();

        log.info(RED_DRAGON_EMERGES);
        dragonSlayer = new DragonSlayer(() ->
            log.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();

        log.info(BLACK_DRAGON_LANDS);
        dragonSlayer = new DragonSlayer(() -> 
            log.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();

        //Implementação com enun
        log.info(GREEN_DRAGON_SPOTTED);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();

        log.info(RED_DRAGON_EMERGES);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();

        log.info(BLACK_DRAGON_LANDS);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();

    }
}
