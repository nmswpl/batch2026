package in.co.nmsworks.training.week3.day5;

public class PlayingCard {
    private String suit;
    private String rank;
    public PlayingCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
