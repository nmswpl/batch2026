package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{
    Coin coin;

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public DigitalWallet(String colour, Coin coin) {
        super(colour);
        this.coin = coin;
    }

    public void makePayment() {
        coin.spends();
    }
}
