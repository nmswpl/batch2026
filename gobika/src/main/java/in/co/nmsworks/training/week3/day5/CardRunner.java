package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class CardRunner {
    public static void main(String[] args) {
        CardRunner cardRunner = new CardRunner();
        cardRunner.deckCards(4);
    }

    private void deckCards(Integer noOfPersons) {
        List<Card> cards = getNewDeck();
        Map<Integer,List<String>> playersCard = new HashMap<>();
        Collections.shuffle(cards);
        int index = 0;
        for (Card card : cards) {
            int personIndex = index % noOfPersons;
            List<String> playerCardList = playersCard.get(personIndex);
            if (playerCardList == null) {
                playerCardList = new ArrayList<>();
                playersCard.put(personIndex, playerCardList);
            }
            playerCardList.add(String.valueOf(card));
            index++;
        }
        for (Map.Entry<Integer,List<String>> card : playersCard.entrySet()){
            System.out.println("Player "+ card.getKey()+" :"+card.getValue());
        }
    }

    private List<Card> getNewDeck() {
        String[] shape = {"H", "D", "S", "C"};
        List<Card> cards = new ArrayList<>();
        for (String card : shape) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(card,i));
            }
        }
        return cards;
    }
}

