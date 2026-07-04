package in.co.nmsworks.training.week3.day5;

public class Card {
    private final String suite;
    private final int value;

    public Card(String suite, int value) {
        this.suite = suite;
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return getSuite() + " " + getValue();
    }
}
