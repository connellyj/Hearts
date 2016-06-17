public class Hand {

    private Card[][] hand = new Card[4][];

    Hand(Card[] unsortedHand, Deck deck) {
        int index;
        for (Card card : unsortedHand) {
            index = Deck.suits.indexOf(card.suit());
            for (Card sortedCard : hand[index]) {
                if (sortedCard == null) {
                    hand[index][0] = card;
                }
            }
        }
    }
}
