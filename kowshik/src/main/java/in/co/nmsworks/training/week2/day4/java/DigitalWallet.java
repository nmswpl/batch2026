package in.co.nmsworks.training.week2.day4.java;

public class DigitalWallet extends PocketItem {
    private Coin coin;

    public DigitalWallet(Coin coin) {
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public void makePayment(){
        coin.spend();
    }
}
