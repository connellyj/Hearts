public class Card {

    private String suit;
    private String level;

    Card(String suit, String level) {
        this.suit = suit;
        this.level = level;
    }

    public String suit() {
        return suit;
    }

    public String level() {
        return level;
    }

    public boolean compareSuit(Card card) {
        return this.suit().equals(card.suit());
    }

    public boolean greaterThan(Card card) {
        if (this.compareSuit(card)) {
            for (int i = 0; i < 13; i++) {
                if (Deck.hierarchy[i].equals(card.level())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lessThan(Card card) {
        if (this.compareSuit(card)) {
            for (int i = 0; i < 13; i++) {
                if (Deck.hierarchy[i].equals(this.level())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.level + " of " + this.suit;
    }
}
