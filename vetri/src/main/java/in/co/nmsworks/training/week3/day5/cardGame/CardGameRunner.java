package in.co.nmsworks.training.week3.day5.cardGame;

import java.util.List;

public class CardGameRunner {
    public static void main(String[] args) {
        Deck myDeck = new Deck();

        myDeck.deck();
        myDeck.shuffleDeck();

        List<List<Card>> distribute = myDeck.distribute(5);

        for (int i = 0; i < distribute.size(); i++) {

            System.out.println(distribute.get(i));
        }
    }


}
