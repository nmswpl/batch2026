package in.co.nmsworks.training.week2.day4.java;

import in.co.nmsworks.training.week2.day1.StirngPracticeQuestions;

public class DigitalWallet extends PocketItem {

    Coin c;

    public Coin getC() {
        return c;
    }

    public void setC(Coin c) {
        this.c = c;
    }

    public DigitalWallet(Coin c) {
        this.c = new Coin(c.getDenomination());
    }

    public void makePayment(){
        c.spend();
    }


}
