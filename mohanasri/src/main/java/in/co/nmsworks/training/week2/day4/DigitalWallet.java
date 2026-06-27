package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{

    Coin coin;

    public DigitalWallet(Coin coin) {
        this.coin = coin;
    }

    public DigitalWallet(String color, Coin coin) {
        super(color);
        this.coin = coin;
    }

    void makePayment(int amt){
        coin.spend(amt);
    }
}
