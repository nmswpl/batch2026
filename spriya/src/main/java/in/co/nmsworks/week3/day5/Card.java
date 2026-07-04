package in.co.nmsworks.week3.day5;

import java.util.*;

public class Card {

    private int noOfPlayers;
    private List<String> cards;

    public Card(int noOfPlayers, List<String> cards) {
        this.noOfPlayers = noOfPlayers;
        this.cards = cards;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }

    public Map<String, List<String>> distribute() {
        Collections.shuffle(cards);

        Map<String, List<String>> map = new HashMap<>();
        int noOfPlayers = getNoOfPlayers();
        int part = 52 / noOfPlayers;

        int j = 0;
        for (int i = 0; i < noOfPlayers; i++) {
            List<String> cardsList = new ArrayList<>();
            for (int k = 0; k < part; k++) {


                cardsList.add(cards.get(j));
                j++;
            }

            map.put("Player " + i, cardsList);

        }

        return map;
    }

    public void printCard(Map<String, List<String>> eachPlayerCard) {

        for (Map.Entry<String, List<String>> stringListEntry : eachPlayerCard.entrySet()) {
            System.out.println(stringListEntry);
        }
    }


}
