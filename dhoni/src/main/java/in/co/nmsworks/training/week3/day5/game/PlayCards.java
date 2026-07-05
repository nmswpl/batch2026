package in.co.nmsworks.training.week3.day5.game;

import java.util.*;

public class PlayCards {

    public static void main(String[] args) {

        PlayCards playCards = new PlayCards();
        Card card = new Card();

        List<String> cardSet = playCards.getSetOfCards(card.map);
        playCards.printCards(3, cardSet);
    }

    private void printCards(int noOfPlayers, List<String> cardSet) {

        Collections.shuffle(cardSet);

        List<List<String>> playerCardLists = new ArrayList<>();

        for(int i =0; i< noOfPlayers; i++){
            playerCardLists.add(new ArrayList<>());
        }

        for(int i = 0; i < cardSet.size(); i++){
            playerCardLists.get(i%noOfPlayers).add(cardSet.get(i));
        }

        for(int i = 0; i < noOfPlayers; i++){
            System.out.println("Player no : " + (i+1));
            for (int j =0; j < playerCardLists.get(i).size(); j++){
                System.out.println(playerCardLists.get(i).get(j));
            }
            System.out.println();
        }
    }


    public List<String> getSetOfCards(Map<String, List<String>> map) {

        List<String> cardSet =new ArrayList<>();

        for(Map.Entry<String,List<String>> card : map.entrySet()){
            for(String type : card.getValue()){
                cardSet.add(card.getKey() + " " + type);
            }
        }
        return cardSet;
    }
}
