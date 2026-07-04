package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardRunner {


    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

        String nameing= "HDSC";
        for (char c : nameing.toCharArray()) {
            for (int i = 1; i <= 13 ; i++) {
                deck.add(new Card(""+c+i));
            }
        }

        System.out.println(deck);

        distribute(deck,14);
    }

    private static void distribute(List<Card> deck, int noOfPlayers) {

        Collections.shuffle(deck);
        System.out.println(deck);

        List<List<String>> playersList = new ArrayList<>();

        for (int i = 1; i <= noOfPlayers ; i++) {
            playersList.add(new ArrayList<>());
        }

        System.out.println("Players List Size = "+playersList.size());

        for (int i = 0; i < 52; i++) {
            playersList.get(i % noOfPlayers).add(deck.get(0).getName());
            deck.remove(0);
        }


        for (List<String> playersCardsList : playersList) {

            System.out.println(playersCardsList);

        }

    }
}
