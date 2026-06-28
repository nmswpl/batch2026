package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{
    Coin coin;

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

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "coin=" + coin +
                "color=" + getColor() +
                '}';
    }
}
