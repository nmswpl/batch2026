package in.co.nmsworks.training.Week3.Map.Day5.Card;

import java.util.List;

public class Dealer {

    private Deck deck;

    public Dealer() {
        deck = new Deck();
    }

    public void distributeCards(List<Player> players) {

        deck.shuffle();

        while (deck.size() >= players.size()) {

            for (Player player : players) {
                player.addCard(deck.drawCard());
            }
        }
    }

    public void printPlayers(List<Player> players) {

        for (Player player : players) {

            System.out.println(player.getName());

            for (Card card : player.getCards()) {
                System.out.println(card);
            }

            System.out.println();
        }
    }
}