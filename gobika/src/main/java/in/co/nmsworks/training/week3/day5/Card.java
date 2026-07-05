package in.co.nmsworks.training.week3.day5;


public class Card {
    private String shape;
    private Integer number;

    public Card() {
    }

    public Card(String shape, Integer number) {
        this.shape = shape;
        this.number = number;
    }

    @Override
    public String toString() {
        return shape+number;
    }
}
