package Hearts;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Created by Julia Connelly
 * June 2016
 *
 * A class that represents a card in a regular deck of 52 cards
 */

class Card {

    private String suit;
    private String rank;
    private GridPane pane;

    /**
     * Constructor that creates a Hearts.Card with a suit and a rank
     * @param suit String
     * @param rank String
     */
    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        pane = new GridPane();
        pane.setPrefSize(40.0, 70.0);
    }

    /**
     * Get method that returns the suit of the Hearts.Card
     * @return String
     */
    String suit() {
        return suit;
    }

    /**
     * Get method that returns the rank of the Hearts.Card
     * @return String
     */
    String rank() {
        return rank;
    }

    /**
     * Returns true if this Hearts.Card and the argument Hearts.Card are the same suit
     * Returns false otherwise
     * @param card Hearts.Card
     * @return boolean
     */
    public boolean compareSuit(Card card) {
        return this.suit().equals(card.suit());
    }

    /**
     * Returns the suit and rank of the card nicely formatted for printing
     * @return String
     */
    public String toString() {
        return this.rank + " of " + this.suit;
    }

    public GridPane pane() {
        if (suit == "Clubs") {

        }
        if (suit == "Diamonds") {

        }
        if (suit == "Spades") {

        }
        //if (suit == "Hearts") {
            Image heartIcon = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Heart_coraz%C3%B3n.svg/2000px-Heart_coraz%C3%B3n.svg.png");
            ImageView heart = new ImageView(heartIcon);
            GridPane.setConstraints(heart, 0, 0);
            GridPane.setConstraints(heart, 5, 8);
            pane.getChildren().add(heart);
        //}
        return pane;
    }
}
