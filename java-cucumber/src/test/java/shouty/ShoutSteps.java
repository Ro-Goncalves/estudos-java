package shouty;

import io.cucumber.java.en.When;
import shouty.support.ShoutyWorld;

public class ShoutSteps {
    private ShoutyWorld world;

    public ShoutSteps(ShoutyWorld world){
        this.world = world;
    }

    @When("{person} shouts")
    public void person_shouts(Person person){
        world.shout(person, "Hello World");
    }

    @When("{person} shouts {string}")
    public void person_shouts_message(Person person, String message){
        world.shout(person, message);
    }
   
    @When("{person} shouts {int} messages containing the word {string}")
    public void person_shouts_messages_containing_the_word(Person person, Integer count, String word){
        String message = "a message containing the word " + word;
        for (int i = 0; i < count; i++) {
            world.shout(person, message);
        }
    }

    @When("{person} shouts the following message")
    public void person_shouts_the_following_message(Person person, String message){
        world.shout(person, message);
    }

    @When("{person} shouts {int} over-long messages")
    public void person_shouts_some_over_long_messages(Person person, Integer count){
        String baseMessage = "A message from Sean that is 181 characters long ";
        String padding = new String(new char[181 - baseMessage.length()]).replace("\0", "Z");;
        String overlongMessage = baseMessage + padding;

        for (int i = 0; i < count; i++) {
            world.shout(person, overlongMessage);
        }
    }
}
