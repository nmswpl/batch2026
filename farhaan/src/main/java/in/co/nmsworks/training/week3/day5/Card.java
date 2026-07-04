package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class Card {
    private String cardType;
    private int cardNumber;

    public Card() {
    }

    @Override
    public String toString() {
        return cardType + cardNumber;
    }

    public Card(String cardType, int cardNumber) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }


}
