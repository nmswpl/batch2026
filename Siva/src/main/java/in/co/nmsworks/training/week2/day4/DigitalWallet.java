package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{
    protected Coin coin;

    public DigitalWallet() {
    }

    public DigitalWallet(Coin coin,String color) {
        this.coin = coin;
        setColor(color);
    }

    public void makePayment() {
        coin.spend();
    }
}
