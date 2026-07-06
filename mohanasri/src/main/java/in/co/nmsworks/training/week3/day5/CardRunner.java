package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CardRunner {
    private List<Card> deck;
    private List<List<Card>> players;
    private final int numPlayers;

    public CardRunner(int numPlayers) {
        this.numPlayers = numPlayers;
        this.deck = new ArrayList<>();
        this.players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            players.add(new ArrayList<>());
        }

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }
    }

    public void shuffleDeck() {
        System.out.println("Dealer is shuffling the deck...\n");
        Collections.shuffle(deck);
    }

    public boolean distributeCards(int cardsPerPlayer) {
        int maxPossible = deck.size() / numPlayers;

        if (cardsPerPlayer > maxPossible) {
            System.out.println("Error: Not enough cards! Maximum possible per player is " + maxPossible + ".");
            return false;
        }

        for (int round = 0; round < cardsPerPlayer; round++) {
            for (int p = 0; p < numPlayers; p++) {
                Card dealtCard = deck.remove(0);
                players.get(p).add(dealtCard);
            }
        }
        return true;
    }

    public void printPlayerCards() {
        System.out.println("--- Player Hands ---");
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + ": " + players.get(i));
        }
    }

    public static void main(String[] args) {
        int numberOfPlayers = 4;
        int cardsToDeal = 5;

        CardRunner game = new CardRunner(numberOfPlayers);

        game.shuffleDeck();

        if (game.distributeCards(cardsToDeal)) {
            game.printPlayerCards();
        }
    }
}

