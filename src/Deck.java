import java.util.Random;

public class Deck {

    private String[] hierarchy = new String[13];
    private Card[] deck = new Card[52];

    Deck() {
        for (Integer i = 2; i < 11; i++) {
            hierarchy[i - 2] = i.toString();
        }
        hierarchy[9] = "Jack";
        hierarchy[10] = "Queen";
        hierarchy[11] = "King";
        hierarchy[12] = "Ace";

        String[] suits = new String[4];
        suits[0] = "Clubs";
        suits[1] = "Diamonds";
        suits[2] = "Spades";
        suits[3] = "Hearts";

        int count = 0;

        for (String suit : suits) {
            for (String level : hierarchy) {
                Card card = new Card(suit, level, this);
                deck[count] = card;
                count++;
            }
        }
        shuffle();
    }

    public String[] hierarchy() {
        return hierarchy;
    }

    public Card[] deck() {
        return deck;
    }

    public void swap(int a, int b) {
        Card tmp = deck[a];
        deck[a] = deck[b];
        deck[b] = tmp;
    }

    public void shuffle() {
        Random random = new Random();
        int rand;
        for (int i = 51; i > 0; i--) {
            rand = random.nextInt(i + 1);
            swap(i, rand);
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.deck()[i]);
        }
    }
}
