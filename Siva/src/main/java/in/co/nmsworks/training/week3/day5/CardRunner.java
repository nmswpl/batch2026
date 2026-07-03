package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardRunner {
    public static void main(String[] args) {
        CardRunner cr = new CardRunner();
        List<Card> cards = cr.getDeck();
        cr.shuffleAndDistribute(cards,5);

    }

    private List<Card> getDeck() {
        List<Card> cards = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            cards.add(new Card("H - " + i));
        }
        for (int i = 2; i < 15; i++) {
            cards.add(new Card("D - " + i));
        }
        for (int i = 2; i < 15; i++) {
            cards.add(new Card("A - " + i));
        }
        for (int i = 2; i < 15; i++) {
            cards.add(new Card("C - " + i));
        }
        return cards;
    }

    public void shuffleAndDistribute(List<Card> cards, Integer noOfPlayer) {
        List<List<Card>> allPlayerCards = new ArrayList<>();
        for (int i = 0; i < noOfPlayer; i++) {
            allPlayerCards.add(new ArrayList<>());
        }
        Collections.shuffle(cards);
        for (int i = 0; i < cards.size(); i++) {
            allPlayerCards.get(i%noOfPlayer).add(cards.get(i));
        }
        for (int i = 0; i < allPlayerCards.size(); i++) {
            System.out.println("==================== Player "+(i+1)+" ========================");
            for (Card eachCard : allPlayerCards.get(i)) {
                System.out.print(eachCard.getName()+" ");
            }
            System.out.println();
            System.out.println("Number of cards :: "+allPlayerCards.get(i).size());
        }
    }
}
