package in.co.nmsworks.training.week3.day5.card;

public class Card {
    private String shape;
    private int num;

    public Card(String shape, int num) {
        this.shape = shape;
        this.num = num;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "shape='" + shape + '\'' +
                ", num=" + num +
                '}';
    }
}
