package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    List<String> cards = new ArrayList<>();
    public Cards() {
    }

    public Cards(List<String> cards) {
        this.cards = cards;
    }

    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }
}
