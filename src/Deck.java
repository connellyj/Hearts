import java.util.ArrayList;
import java.util.Random;

public class Deck {

    public static final String[] hierarchy = new String[13];
    public static final Card[] deck = new Card[52];
    public static final ArrayList<String> suits = new ArrayList<>(4);

    Deck() {
        for (Integer i = 2; i < 11; i++) {
            hierarchy[i - 2] = i.toString();
        }
        hierarchy[9] = "Jack";
        hierarchy[10] = "Queen";
        hierarchy[11] = "King";
        hierarchy[12] = "Ace";

        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Spades");
        suits.add("Hearts");

        int count = 0;

        for (String suit : suits) {
            for (String level : hierarchy) {
                Card card = new Card(suit, level);
                deck[count] = card;
                count++;
            }
        }
        shuffle();
    }

    public Card[] getDeck() {
        return deck;
    }

    public void shuffle() {
        Random random = new Random();
        int rand;
        for (int i = 51; i > 0; i--) {
            rand = random.nextInt(i + 1);
            Card tmp = deck[rand];
            deck[rand] = deck[i];
            deck[i] = tmp;
        }
    }

    public Hand[] deal() {

    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.getDeck()[i]);
        }
    }
}
