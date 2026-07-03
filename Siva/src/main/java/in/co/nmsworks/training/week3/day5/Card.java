package in.co.nmsworks.training.week3.day5;

import javafx.print.Collation;
import sun.text.resources.sk.CollationData_sk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
}
