package Hearts;

/**
 * Created by Julia Connelly
 * June 2016
 *
 * Controller for the GUI
 * Responds to user input
 */

public class SessionController {

    public void initialize() {
        Deck deck = new Deck();
        Hand[] hands = deck.deal();
        Hand player = hands[0];
        Hand AI1 = hands[1];
        Hand AI2 = hands[2];
        Hand AI3 = hands[3];
        for (Card card : player.getHand()) {

        }
    }
}
