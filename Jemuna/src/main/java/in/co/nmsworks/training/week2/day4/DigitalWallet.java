package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem {

    public Coin coin;

    public DigitalWallet(Coin coin) {
        this.coin = coin;
    }

    public void makePayment(){
        coin.spend();

    }

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "coin=" + coin +
                ", color='" + color + '\'' +
                '}';
    }
}
