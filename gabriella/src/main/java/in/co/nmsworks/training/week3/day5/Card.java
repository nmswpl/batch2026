package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String type;
    private Integer number;

    public Card() {}

    public Card(String type, Integer number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
