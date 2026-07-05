package in.co.nmsworks.training.week3.day5.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card {


    Map<String, List<String>> map;
    List<String> cards;
    public Card() {
        cards = new ArrayList<>();
        map = new HashMap<>();

        cards.add("K");
        cards.add("Q");
        cards.add("A");
        cards.add("J");
        cards.add("1");
        cards.add("2");
        cards.add("3");
        cards.add("4");
        cards.add("5");
        cards.add("6");
        cards.add("7");
        cards.add("8");
        cards.add("9");
        map.put("red-d",cards);
        map.put("red-h",cards);
        map.put("black-s",cards);
        map.put("black-c",cards);
    }

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }

    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }
}
