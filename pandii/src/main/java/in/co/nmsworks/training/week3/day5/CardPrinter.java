package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardPrinter {
    public static void main(String[] args) {

        CardPrinter cardPrinter=new CardPrinter();
        char [] suites={'S','C','H','D'};
        List<Cards> totalCards=cardPrinter.createCards(suites);
//        System.out.println(totalCards);
        cardPrinter.distributeCards(totalCards,6);


    }

    private void distributeCards(List<Cards> allCards,int noOfPlayers) {
        Collections.shuffle(allCards);
//        System.out.println(allCards.size());

        List<List<String>> eachPlayercards=new ArrayList<>();

        int cardInd=1;

        for (int i=1;i<=noOfPlayers;i++)
        {
            eachPlayercards.add(new ArrayList<>());
        }
        for (Cards allCard : allCards) {
            int playerNum=cardInd%noOfPlayers;
            eachPlayercards.get(playerNum).add("Player "+playerNum+" : "+allCard.getSuite()+" "+allCard.getNumber());
            cardInd++;
        }
        for (List<String> eachPlayercard : eachPlayercards) {
            System.out.println(eachPlayercard);
        }

    }

    private List<Cards> createCards(char[] suites) {
        List<Cards> allCards=new ArrayList<>();
        for (char suite : suites) {
            for(int i=1;i<14;i++)
            {
                allCards.add(new Cards(suite,i));
            }
        }
        return allCards;
    }
}
