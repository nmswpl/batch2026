package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class CardsRunner {
    public static void main(String[] args) {
        List<String > deck = getDeck();
        Collections.shuffle(deck);

        distributeCards(deck,5);
    }

    private static void distributeCards(List<String> deck,int numberOfPlayers) {
        List<List<String>> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new ArrayList<>());

        }
        for (int i = 0; i < deck.size(); i++) {
            int playerIndex = i%numberOfPlayers;
            players.get(playerIndex).add(deck.get(i));
        }
        for (int i = 0; i < players.size(); i++) {
            System.out.println("player"+i + "-->"+players.get(i));
        }
    }

    private static List<String> getDeck() {
        Cards card = new Cards();

        List<String > deck = new ArrayList<>();
        for(String i : card.suite){
            for (int j = 1; j <= 13; j++) {
                deck.add(i+j);
            }
        }
        return deck;

    }


}
