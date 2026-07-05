package in.co.nmsworks.training.week3.day6;

public class Card {
    String suit;
    String value;

    Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return value + " of " + suit;
    }
}
