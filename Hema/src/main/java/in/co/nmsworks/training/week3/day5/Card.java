package in.co.nmsworks.training.week3.day5;

public class Card {

    private String name;

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                '}';
    }
}
