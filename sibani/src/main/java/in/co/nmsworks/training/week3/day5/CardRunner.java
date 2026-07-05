package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck ();
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player("Player " + i));
        }
        deck.shuffle();
        int totalCardsToDeal = 52 - (52 % numPlayers);
        for (int i = 0; i < totalCardsToDeal; i++) {
            Player currentPlayer = players.get(i % numPlayers);
            Card cardDealt = deck.dealCard();
            currentPlayer.receiveCard(cardDealt);
        }
        for (Player player : players) {
            player.printHand();
        }
        scanner.close();
    }
}
