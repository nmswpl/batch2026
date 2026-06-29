package in.co.nmsworks.training.week2.day4.pocket;

public class DigitalWallet extends PocketItem{
    Coin c;

    public Coin getC() {
        return c;
    }

    public void setC(Coin c) {
        this.c = c;
    }

    public void makePayment(){
        c.spend();

    }
}
